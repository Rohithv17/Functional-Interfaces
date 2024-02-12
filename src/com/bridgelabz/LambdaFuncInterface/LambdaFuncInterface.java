package com.bridgelabz.LambdaFuncInterface;
//empty
//interface LambdaFuncInterface {
//}

// EXAMPLE 2
@FunctionalInterface
interface Car{
    public String travel(String source,String destination);
}

/*class Bmw implements Car{
    public  void travel(String source,String destination){
        System.out.println("Travel from "+source+" To " + destination+ " in a Bmw car");
        return("Total fare is : Rs 2000");
    }

} */


class main1{
    public static void main(String[] args) {
        Car c=(source,destination)-> {
            System.out.println("Travel from "+source+" To " + destination+ " in a Bmw car");
            return "Total fare is : Rs 2000";
        };
        System.out.println(c.travel("Chennai","Bangalore"));
    }
}
