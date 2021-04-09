import java.util.*;

public class input_demo {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);

        //获取名字
        System.out.println("你的姓是什么");
        String name = inn.nextLine();

        //获取单词，以空白符结尾
        System.out.println("写一个喜欢的单词");
        String Favorite_word = inn.next();

        //获取年龄，int型数据
        System.out.println("多大了：");
        int age = inn.nextInt();

        //获取成绩，double
        System.out.println("英语成绩：");
        double grade = inn.nextDouble();

        //输出
        String out = name + "先生喜欢的单词是 " + Favorite_word + "\n他今年已经" + age +"岁了，还记得第一次英语考试" + grade +"分" ;
        System.out.println(out);
        for(int i = 10; i > 1;i--)
            System.out.println(name + " 先生，下一年" + i + "岁了");

    }
}
