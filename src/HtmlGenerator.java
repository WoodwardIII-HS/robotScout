import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlGenerator {

    public static void main(String[] args) {
        String filename = "output.html";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            // HTML structure
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("<title>Generated HTML</title>\n");
            writer.write("</head>\n");
            writer.write("<body>\n");

            // Content of the HTML
            writer.write("<h1>Hello, World!</h1>\n");
            writer.write("<p>This HTML file was generated by a Java program.</p>\n");

            // Example of adding a list
            writer.write("<ul>\n");
            writer.write("  <li>Item 1</li>\n");
            writer.write("  <li>Item 2</li>\n");
            writer.write("  <li>Item 3</li>\n");
            writer.write("</ul>\n");

            // Example of adding a link
            writer.write("<a href=\"https://www.example.com\">Example Link</a>\n");

            // Closing tags
            writer.write("</body>\n");
            writer.write("</html>\n");

            System.out.println("HTML file '" + filename + "' generated successfully.");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}