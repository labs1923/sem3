// //Implementation using extends threas.
// class Week11_a{
//     public static void main(String... args){
//         Good_Morning t1 = new Good_Morning();
//         Hello t2 = new Hello();
//         Welcome t3 = new Welcome();
//         t1.start();t2.start();t3.start();
//     }
// }

// class Good_Morning extends Thread {
//     public void run(){
//         for(int i = 0 ; i  < 5 ; i++){
//             System.out.println("Good Morning");
//             try{sleep(1000);}catch(Exception e){}
//         }
//     }
// }

// class Hello extends Thread {
//     public void run(){
//         for(int i = 0 ; i  < 5 ; i++){
//             System.out.println("Hello");
//             try{sleep(2000);}catch(Exception e){}
//         }
//     }
// }

// class Welcome extends Thread {
//     public void run(){
//         for(int i = 0 ; i  < 5 ; i++){
//             System.out.println("Welcome");
//             try{sleep(3000);}catch(Exception e){}
//         }
//     }
// }


//implementing using runnable.

class Week11_a{
    public static void main(String... args){
        Good_Morning obj1 = new Good_Morning();
        Thread t1 = new Thread(obj1);
        Hello obj2 = new Hello();
        Thread t2 = new Thread(obj2);
        Welcome obj3 = new Welcome();
        Thread t3 = new Thread(obj3);
        t1.start();t2.start();t3.start();
    }
}

class Good_Morning implements Runnable {
    public void run(){
        for(int i = 0 ; i  < 5 ; i++){
            System.out.println("Good Morning");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

class Hello implements Runnable {
    public void run(){
        for(int i = 0 ; i  < 5 ; i++){
            System.out.println("Hello");
            try{Thread.sleep(2000);}catch(Exception e){}
        }
    }
}

class Welcome implements Runnable {
    public void run(){
        for(int i = 0 ; i  < 5 ; i++){
            System.out.println("Welcome");
            try{Thread.sleep(3000);}catch(Exception e){}
        }
    }
}