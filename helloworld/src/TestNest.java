public class TestNest {
    public static void main(String[] args) {
//        for(int i=1;i<6;i++){
//            for(int j=0;j<5;j++){
//                System.out.print(i+"\t");
//            }
//            System.out.println();
//        }
        //打印乘法表
       /* for(int x=1;x<10;x++){
            for(int y=1;y<=x;y++){
                System.out.print(y+"*"+x+"="+(x*y<10? " ":"")+x*y+"\t");
            }
            System.out.println();
        }*/
        //打印方阵
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if((i+j)%2==0){
                    System.out.print("*\t");
                }else{
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}
