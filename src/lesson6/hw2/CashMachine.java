package lesson6.hw2;

public class CashMachine {
    int countInMachine100;
    int countInMachine50;
    int countInMachine20;

    public CashMachine(int count100, int count50, int count20) {
        countInMachine100 = count100;
        countInMachine50 = count50;
        countInMachine20 = count20;
    }

    public void addCash(int count100, int count50, int count20) {
        countInMachine100 += count100;
        countInMachine50 += count50;
        countInMachine20 += count20;
    }

    public boolean payment(int sum) {
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;

        count100 = sum / 100;

        if (count100 > this.countInMachine100) {
            count100 = this.countInMachine100;
        }

        sum -= count100 * 100;

        count50 = sum / 100 * 2;

        if (count50 > this.countInMachine50) {
            count50 = this.countInMachine50 / 2 * 2;
        }

        sum -= count50 * 50;

        count20 = sum / 100 * 5;

        if (count20 > this.countInMachine20) {
            count20 = this.countInMachine20 / 5 * 5;
        }

        sum -= count20 * 20;

        if (sum >= 100) {
            System.out.println("Выдать запрошенную сумму невозможно");
            return false;
        } else {
            switch (sum) {
                case 10:
                case 30:
                    System.out.println("Выдать запрошенную сумму невозможно");
                    return false;
                case 20:
                case 40:
                case 60:
                case 80:
                    count20 += sum / 20;
                    break;
                default:
                    ++count50;
                    sum -= 50;
                    count20 += sum / 20;
            }

            if (count50 <= this.countInMachine50 && count20 <= this.countInMachine20) {
                this.countInMachine100 -= count100;
                this.countInMachine50 -= count50;
                this.countInMachine20 -= count20;
                System.out.println( "Выдано:\n" +
                                    "100 : " + count100 + "\n" +
                                    "50 : " + count50 + "\n" +
                                    "20 : " + count20
                                    );
                return true;
            } else {
                System.out.println("Выдать запрошенную сумму невозможно");
                return false;
            }
        }
    }
}
