package expression.operations;

import expression.BinaryFunction;
import expression.CommonExpression;

public class Subtract extends BinaryFunction implements CommonExpression {
    public Subtract(CommonExpression fir, CommonExpression sec) {
        first = fir;
        second = sec;
    }

    public int calc(int x, int y) {
        return x - y;
    }

    public int rank() {
        return 2;
    }

    public String symbol() {
        return "-";
    }

    @Override
    protected double calc(double x, double y) {
        return x - y;
    }
}
