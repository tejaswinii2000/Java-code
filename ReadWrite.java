import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
class ReadWrite
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        FileReader fr=null;
        String str = " FileWriter and FileReader";

        FileWriter fw=new FileWriter("output.txt");
        for (int i = 0; i < str.length(); i++)
        fw.write(str.charAt(i));
        fw.close();
        try
        {
            fr = new FileReader("text");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
        fr.close();
    }
}