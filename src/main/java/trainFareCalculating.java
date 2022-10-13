public class trainFareCalculating {

    public static int trainFareCalculate(int h, int age) {
        if (!(age >= 0 && age <= 200) || !(h >= 0 && h < 24)) {
            return -1;
        }
        if (age >= 0 && age < 6) {
            return 0;
        }
        if ((h >= 0 && h < 9) || (h >= 17 && h < 19)) {
            if (age >= 6 && age <= 10) return 45000;
            if (age > 10 && age < 60) return 60000;
            return 51000;
        }
        if (age >= 6 && age <= 10) return 30000;
        if (age > 10 && age < 60) return 40000;
        return 34000;
    }
}