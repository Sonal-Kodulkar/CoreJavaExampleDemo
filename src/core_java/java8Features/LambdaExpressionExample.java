package core_java.java8Features;

public class LambdaExpressionExample {
    public static void main(String[] args) {

        //Case 1 : Having No parameter
        LambdaExpression lambdaExpression = () -> {
            System.out.println("Lambda expression using no parameter");
        };
        System.out.println("Case 1 output having no parameter in argument list");
        lambdaExpression.lambda();

        // Case 2 : Having a parameter
        LambdaExpressionUsingParameter l2 = (a, b) -> {
            System.out.println(a + b);
        };
        System.out.println("Case 2 output having parameter in argument list");
        l2.lambdaAdd(10, 20);
        l2.lambdaAdd(100, 200);

        // Case 3: Using return keyword
        LambdaExpressionWithReturn l3 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println("Case 3 output having parameter in argument list with return type");
        System.out.println("Addition result is:" + l3.addition(10, 20));


    }

}
