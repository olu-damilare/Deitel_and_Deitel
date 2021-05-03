package chapterTen;

import chapterNine.Employee;

import java.util.Calendar;

public class PieceWorker extends Employee {
    private final double wagePerPiece;
    private final int numberOfPiecesMade;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Calendar dateOfBirth, double wagePerPiece, int numberOfPiecesMade) {
        super(firstName, lastName, socialSecurityNumber, dateOfBirth);
        validateWagePerPiece(wagePerPiece);
        validateNumberOfPiecesMade(numberOfPiecesMade);
        this.wagePerPiece = wagePerPiece;
        this.numberOfPiecesMade = numberOfPiecesMade;
    }

    private void validateNumberOfPiecesMade(int numberOfPiecesMade) {
        if(numberOfPiecesMade < 0)
            throw new IllegalArgumentException("Invalid number of pieces made");
    }

    private void validateWagePerPiece(double wagePerPiece) {
        if(wagePerPiece < 0)
            throw new IllegalArgumentException("Wage must be greater than zero");
    }

    @Override
    public double calculatePaymentAmount() {
        return getNumberOfPiecesMade() * getWagePerPiece();
    }

    private double getWagePerPiece() {
        return wagePerPiece;
    }

    private double getNumberOfPiecesMade() {
        return numberOfPiecesMade;
    }

    @Override
    public String toString() {
        return "Piece worker\n" +
                super.toString() +
                "Wage per Piece = " + getNumberOfPiecesMade() + '\n' +
                "Number of pieces made = " + getWagePerPiece();
    }
}
