
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";//Deklrasi dan inisiasi variabel string dengan isi "Welcome to Core Java!
        System.out.println(greeting);//Menampilkan nilai variabel greeting ke layar

        //Loop untuk menampilkan "=" sebanyak panjangnya string greeting
        for (int i = 0; i < greeting.length();i++)
            System.out.print("="); //Menampilkan "=" ke layar
        System.out.println();//Menampilkan baris baru setelah loop telah selesai
    }
}

