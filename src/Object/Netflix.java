package Object;

public class Netflix {

  //    create NetFlix-Class:
  //    `create following instance fields in the NetFlix-Class
  //        -accountName, userName, monthlyData
  //    `create a method that will update monthlyData for every usage
  //    `make sure this method takes parameter for data usage
  //    `run your code in a Test-Class


    String accountName;
    static String userName;
    static int monthlyData =100;

    public static void usage (int dataUsage){
       // userName = user;
        monthlyData = monthlyData-dataUsage;
        System.out.println("The monthly update is " + monthlyData + " GB of data." );


    }

}
