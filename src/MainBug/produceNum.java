package MainBug;

import java.util.Random;
import java.util.Scanner;

class f{
    int x;//分子
    int y;//分母
}

public class produceNum {

    public static int gcd(int x,int y)
    {
        return gcd(y,x%y);
    }
    public static f setf(f s)
    {
        Random random=new Random();
        s.x=random.nextInt(10)+1;
        s.y=random.nextInt(10)+1;
        int yue=gcd(s.x,s.y);
        s.x=s.x/yue;
        s.y=s.y/yue;
        return s;
    }

    public static f addf(f a,f b)
    {
        f ansf=new f();
        ansf.y=a.y*b.y;
        ansf.x=a.x*b.y+a.y*b.x;
        int yue=gcd(ansf.x,ansf.y);
        ansf.x=ansf.x/yue;
        ansf.y=ansf.y/yue;
        return ansf;
    }

    public static f reducef(f a,f b)
    {
        f ansf=new f();
        ansf.y=a.y*b.y;
        ansf.x=a.x*b.y-a.y*b.x;
        int yue=gcd(ansf.x,ansf.y);
        ansf.x=ansf.x/yue;
        ansf.y=ansf.y/yue;
        return ansf;
    }

    public static f chengf(f a,f b)
    {
        f ansf=new f();
        ansf.y=a.y*b.y;
        ansf.x=a.x*b.x;
        int yue=gcd(ansf.x,ansf.y);
        ansf.x=ansf.x/yue;
        ansf.y=ansf.y/yue;
        return ansf;
    }

    public static f chuf(f a,f b)
    {
        f ansf=new f();
        ansf.y=a.y*b.x;
        ansf.x=a.x*b.y;
        int yue=gcd(ansf.x,ansf.y);
        ansf.x=ansf.x/yue;
        ansf.y=ansf.y/yue;
        return ansf;
    }
    //public static String s=e2(0);
    public static void printText() {
       /*for(int i=1;i<=50;i++)
            produceNum pro=new produceNum();
            String str=pro.e2(0);
            fileText.createFile("Exercises",i+": "+str+" = ");
            fileText.createFile("Answers",i+": "+ans.evaluateExpression(str));
        }*/

       //检验一到四年级全为整数
      /*  produceNum pro=new produceNum();
        EvaluateExpression eval=new EvaluateExpression();
        String str=pro.four(0);
        double result2=eval.evaluateExpressionDouble(str);
        //判断负号和小数，如果有负号，小数，重新生成
        while(result2<0||(int)result2!=result2) {
            pro=new produceNum();
            eval=new EvaluateExpression();
            str=pro.four(0);
            result2=eval.evaluateExpressionDouble(str); //计算表达式
        }
        System.out.println(str);
        System.out.println((int)result2);*/

        produceNum pro=new produceNum();
        EvaluateExpression eval=new EvaluateExpression();
        String str=pro.five(0);
        System.out.println(str);
        String suffix =eval.infixToSuffix(str);//中缀转后缀
        System.out.println(suffix);
        double result2=eval.suffixToArithmetic(suffix);
        System.out.println(result2);
    }

    //单个加减
    public String one(int dep)
    {
        Random random=new Random();
        int num= random.nextInt(3);
        //System.out.println(num);
        if((num==0&&dep>0)||dep>=1) {
            return String.valueOf(random.nextInt(9)+1);
        }
        else if(num==1) {
            return one(dep+1)+" + "+one(dep+1);
        }
        else{
            return one(dep+1)+" - "+one(dep+1);
        }
    }

    //加减混合
    public String two(int dep)
    {
        Random random=new Random();
        int num= random.nextInt(3);
        //System.out.println(num);
        if((num==0&&dep>0)||dep>=2) {
            return String.valueOf(random.nextInt(9)+1);
        }
        else if(num==1) {
            return two(dep+1)+" + "+two(dep+1);
        }
        else{
            return two(dep+1)+" - "+two(dep+1);
        }
    }

    //单个乘除
    public String three(int dep)
    {
        Random random=new Random();
        int num= random.nextInt(3);
        //System.out.println(num);
        if((num==0&&dep>0)||dep>=1) {
            return String.valueOf(random.nextInt(9)+1);
        }
        else if(num==1) {
            return three(dep+1)+" * "+three(dep+1);
        }
        else{
            return three(dep+1)+" / "+three(dep+1);
        }
    }

    public String four(int dep)
    {
        Random random=new Random();
        int num= random.nextInt(3);
        //System.out.println(num);
        if((num==0&&dep>0)||dep>=2) {
            return String.valueOf(random.nextInt(9)+1);
        }
        else if(num==1) {
            return four(dep+1)+" * "+four(dep+1);
        }
        else{
            return four(dep+1)+" / "+four(dep+1);
        }
    }

    public String five(int dep)
    {
        Random rand=new Random();
        int num=rand.nextInt(6);
        if((num==0&&dep>0)||dep>=2) {
            return String.format("%d",rand.nextInt(9)+1)+"/"+String.format("%d",rand.nextInt(9)+1);
        }
        else if(num==1){
            return five(dep+1)+" + "+five(dep+1);
        }
        else {
            return five(dep+1)+" - "+five(dep+1);
        }
    }
    public String model(int x)
    {
        Random rand=new Random();
        int num=rand.nextInt(17)+1;
        switch (num)
        {
            f anst=new f();f s1=new f();f s2=new f();f s3=new f();f s4=new f();
            anst=(setf(s1)+setf(s2))-(setf(s3)+setf(s3));
            case 1:  s[t].value = (s[t].j + s[t].k) - (s[t].m + s[t].n); break;
            case 2:  s[t].value = (s[t].j - s[t].k) - (s[t].m + s[t].n); break;
            case 3:  s[t].value = (s[t].j - s[t].k) - (s[t].m - s[t].n); break;
            case 4:  s[t].value = (s[t].j + s[t].k)*(s[t].m + s[t].n); break;
            case 5:  s[t].value = (s[t].j + s[t].k)*(s[t].m - s[t].n); break;
            case 6:  s[t].value = (s[t].j - s[t].k)*(s[t].m + s[t].n); break;
            case 7:  s[t].value = (s[t].j - s[t].k)*(s[t].m - s[t].n); break;
            case 8: s[t].value = (s[t].j*s[t].k)*(s[t].m + s[t].n); break;
            case 9: s[t].value = (s[t].j*s[t].k)*(s[t].m - s[t].n); break;
            case 10: s[t].value = s[t].j + s[t].k + s[t].m + s[t].n; break;
            case 11: s[t].value = s[t].j - s[t].k - s[t].m - s[t].n; break;
            case 12: s[t].value = s[t].j*s[t].k*s[t].m; break;
            case 13: s[t].value = s[t].j*s[t].k*s[t].m + s[t].n; break;
            case 14: s[t].value = s[t].j*s[t].k*s[t].m - s[t].n; break;
            case 15: s[t].value = s[t].j + s[t].k; break;
            case 16: s[t].value = s[t].j - s[t].k; break;
            case 17: s[t].value = s[t].j*s[t].k; break;
        }
    }



    public  String ee(int dep) {
        Random rand=new Random();
        int num=rand.nextInt(6);
        if((num==0&&dep>0)||dep>=2) {
            return String.format("%d",rand.nextInt(9)+1);
        }
        else if(num==1){
            return ee(dep+1)+" + "+ee(dep+1);
        }
        else if(num==2){
            return ee(dep+1)+" - "+ee(dep+1);
        }
        else if(num==3){
            return ee(dep+1)+" * "+ee(dep+1);
        }
         /*else if(num==4){
                return ee(dep+1)+" / "+ee(dep+1);
        }*/
        else return " ( "+e2(dep+1)+" ) ";
    }

    public  String e2(int dep) {
        Random rand=new Random();
        int num=rand.nextInt(4)+1;
        if(num==1){
            return ee(dep+1)+" + "+ee(dep+1);
        }
        else if(num==2){
            return ee(dep+1)+" - "+ee(dep+1);
        }
        else {
            return ee(dep+1)+" * "+ee(dep+1);
        }
       /* else {
            return ee(dep+1)+" / "+ee(dep+1);
        }*/
    }
}
