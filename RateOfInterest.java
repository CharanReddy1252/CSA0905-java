class Bank {
    double getRateOfInterest() {
        return 0.0; // Default interest rate, to be overridden by specific banks.
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.4; // SBI's interest rate
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.3; // ICICI's interest rate
    }
}

class AXIS extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.7; // AXIS's interest rate
    }
}

public class BankInterest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("SBI Interest Rate: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getRateOfInterest() + "%");
        System.out.println("AXIS Interest Rate: " + axis.getRateOfInterest() + "%");
    }
}
