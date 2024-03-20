

public class Demo1 {
    public static void main(String[] args) {
      System.out.println("Hello World");
      test();
      Demo2 demo2Instance = new Demo2();
        demo2Instance.test();
    }

    static void test()
    {
      System.out.println("ini ada pada method test");
    }
    
  }
  