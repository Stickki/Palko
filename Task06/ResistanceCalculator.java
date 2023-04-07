public interface ResistanceCalculator {
    double get8YearResistance(double current, double voltage);
    double get16YearResistance(double current, double voltage);
    }