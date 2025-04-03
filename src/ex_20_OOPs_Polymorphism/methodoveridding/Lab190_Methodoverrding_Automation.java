package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab190_Methodoverrding_Automation {

    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();


        // Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new Firefox();
        c3.openBrowser();


        // Firefox ff = new ChromeTC(); Not relation



    }

}

class CommonToAll{

    void openBrowser(){
        System.out.println("Open the IE Browser!");
    }

}

class ChromeTC extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Chrome will open now!");
    }

    int openBrowser(int a){
        return 10;
    }

}

class Firefox extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
}