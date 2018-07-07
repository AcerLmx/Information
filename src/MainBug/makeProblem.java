package MainBug;

public class makeProblem {
    public static void printText(int grade, int num) {
        for (int i = 1; i <= num; i++) {
            if (grade == 1)//一年级
            {
                produceNum pro = new produceNum();
                EvaluateExpression eval = new EvaluateExpression();
                String str = pro.one(0);
                double result2 = eval.evaluateExpressionDouble(str);
                //判断负号和小数，如果有负号，小数，重新生成
                while (result2 < 0 || (int) result2 != result2) {
                    pro = new produceNum();
                    eval = new EvaluateExpression();
                    str = pro.one(0);
                    result2 = eval.evaluateExpressionDouble(str); //计算表达式
                }
                System.out.println(i + ". " + str + " = " + (int) result2);
            } else if (grade == 2)//二年级
            {
                produceNum pro = new produceNum();
                EvaluateExpression eval = new EvaluateExpression();
                String str = pro.two(0);
                double result2 = eval.evaluateExpressionDouble(str);
                //判断负号和小数，如果有负号，小数，重新生成
                while (result2 < 0 || (int) result2 != result2) {
                    pro = new produceNum();
                    eval = new EvaluateExpression();
                    str = pro.two(0);
                    result2 = eval.evaluateExpressionDouble(str); //计算表达式
                }
                System.out.println(i + ". " + str + " = " + (int) result2);
            } else if (grade == 3)//三年级
            {
                produceNum pro = new produceNum();
                EvaluateExpression eval = new EvaluateExpression();
                String str = pro.three(0);
                double result2 = eval.evaluateExpressionDouble(str);
                //判断负号和小数，如果有负号，小数，重新生成
                while (result2 < 0 || (int) result2 != result2) {
                    pro = new produceNum();
                    eval = new EvaluateExpression();
                    str = pro.three(0);
                    result2 = eval.evaluateExpressionDouble(str); //计算表达式
                }
                System.out.println(i + ". " + str + " = " + (int) result2);
            } else if (grade == 4)//四年级
            {
                produceNum pro = new produceNum();
                EvaluateExpression eval = new EvaluateExpression();
                String str = pro.four(0);
                double result2 = eval.evaluateExpressionDouble(str);
                //判断负号和小数，如果有负号，小数，重新生成
                while (result2 < 0 || (int) result2 != result2) {
                    pro = new produceNum();
                    eval = new EvaluateExpression();
                    str = pro.four(0);
                    result2 = eval.evaluateExpressionDouble(str); //计算表达式
                }
                System.out.println(i + ". " + str + " = " + (int) result2);
            } else if (grade == 5)//五年级
            {
                produceNum pro = new produceNum();
                f ansf = pro.five();
                while (ansf.x / ansf.y < 0) {
                    pro = new produceNum();
                    ansf = pro.five();
                }
                String answer = "";
                if (ansf.x == 0) {
                    answer = String.valueOf(0);
                } else if (ansf.y == 1) {
                    answer = String.valueOf(ansf.x);
                } else if (ansf.x < ansf.y) {
                    answer = String.valueOf(ansf.x) + "/" + String.valueOf(ansf.y);
                } else {
                    int dai = ansf.x / ansf.y;
                    int fen = ansf.x % ansf.y;
                    answer = String.valueOf(dai) + "`" + String.valueOf(fen) + "/" + String.valueOf(ansf.y);
                }
                System.out.println(answer);
            } else {
                produceNum pro = new produceNum();
                f ansf = pro.six();
                while (ansf.x / ansf.y < 0) {
                    pro = new produceNum();
                    ansf = pro.six();
                }
                String answer = "";
                if (ansf.x == 0) {
                    answer = String.valueOf(0);
                } else if (ansf.y == 1) {
                    answer = String.valueOf(ansf.x);
                } else if (ansf.x < ansf.y) {
                    answer = String.valueOf(ansf.x) + "/" + String.valueOf(ansf.y);
                } else {
                    int dai = ansf.x / ansf.y;
                    int fen = ansf.x % ansf.y;
                    answer = String.valueOf(dai) + "`" + String.valueOf(fen) + "/" + String.valueOf(ansf.y);
                }
                System.out.println(answer);
            }
        }

    }
}
