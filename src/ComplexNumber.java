import static java.lang.Math.abs;

public class ComplexNumber {
    private float absolute;
    private float argument;

    public ComplexNumber(float absolute, float argument) {
        this.setArgument(argument);
        this.setAbsolute(absolute);
    }

    public void setArgument(float argument) {
        if (Math.abs(argument) <= 1) {
            this.argument = argument;
        } else {
            this.argument = 2;
        }
    }

    public void setAbsolute(float absolute) {
        if (absolute < 0) {
            this.absolute = -1;
        } else {
            this.absolute = absolute;
        }
    }

    public float getAbsolute() {
        return this.absolute;
    }

    public float getArgument() {
        return this.argument;
    }

    public String complexRoot(float rtNum) {
        rtNum = Math.abs(rtNum);
        String ans = "";
        float absRt = (float) (Math.pow(this.getAbsolute(), 1 / rtNum));
        for (int i = 0; i < ((int) rtNum); i++) {
            ans += "z(" + i + ") = " + absRt + " * (cos((" + this.getArgument() + " + 2*pi*" + i + ")/" + ((int) rtNum)
                    + ") + " + "i*sin((" + this.getArgument() + " + 2*pi*" + i + ")/" + ((int) rtNum) + ")\n";
        }
        return ans;
    }

    public static String complexDivision(ComplexNumber first, ComplexNumber second) {
        String ans = "";
        ans = "(" + (first.getAbsolute()) / (second.getAbsolute()) + ")*(cos(" +
                (first.getArgument() - second.getArgument()) + ") + i*sin(" +
                (first.getArgument() - second.getArgument()) + "))";
        return ans;
    }

    public static String complexMultiplication(ComplexNumber first, ComplexNumber second) {
        String ans = "";
        ans = "(" + (first.getAbsolute()) * (second.getAbsolute()) + ")*(cos(" +
                (first.getArgument() + second.getArgument()) + ") + i*sin(" +
                (first.getArgument() + second.getArgument()) + "))";
        return ans;
    }

    public static String complexSum(ComplexNumber first, ComplexNumber second) {
        String ans = "";
        float firstA = first.getAbsolute() * ((float) Math.cos(first.getArgument()));
        float firstB = first.getAbsolute() * ((float) Math.sin(first.getArgument()));

        float secondA = second.getAbsolute() * ((float) Math.cos(second.getArgument()));
        float secondB = second.getAbsolute() * ((float) Math.sin(second.getArgument()));

        float aSum = secondA + firstA;
        float bSum = secondB + firstB;

        return aSum + " + i*(" + bSum + ")";
    }

    public static String complexSubtraction(ComplexNumber first, ComplexNumber second) {
        String ans = "";
        float firstA = first.getAbsolute() * ((float) Math.cos(first.getArgument()));
        float firstB = first.getAbsolute() * ((float) Math.sin(first.getArgument()));

        float secondA = second.getAbsolute() * ((float) Math.cos(second.getArgument()));
        float secondB = second.getAbsolute() * ((float) Math.sin(second.getArgument()));

        float aSum = secondA - firstA;
        float bSum = secondB - firstB;

        return aSum + " + i*(" + bSum + ")";
    }

    @Override
    public String toString() {
        return this.absolute + "*(cos(" + this.argument + ") + i*sin(" + this.argument + "))";
    }
}
