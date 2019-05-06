package ru.job4j.condition;


import java.awt.Desktop;
        import java.io.*;

public class Yxxx {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("Yxxx.java"));

        File f = new File("source.htm");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<h1>ShowGeneratedHtml source</h1>");
        bw.write("<textarea cols=75 rows=30>");

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        bw.write("</text" + "area>");
        bw.write("</body>");
        bw.write("</html>");

        br.close();
        bw.close();

        Desktop.getDesktop().browse(f.toURI());
    }
}