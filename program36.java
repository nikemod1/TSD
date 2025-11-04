import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");

        int c;
        while ((c = fr.read()) != -1)
            fw.write(c);

        fr.close();
        fw.close();
        System.out.println("File copied successfully.");
    }
}
