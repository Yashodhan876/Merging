public class PrintTables1To10 {
    public void printTableof(int num){
        System.out.println("------------------------------------");
        System.out.println(num+" table is as follws:");
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
        System.out.println("------------------------------------");
    }
}
