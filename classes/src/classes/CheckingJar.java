package classes;

import java.io.File;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


public class CheckingJar {
    public static void main(String[] args) {
        String jarFilePath = "C:\\Users\\91983\\Downloads\\extentreports-5.1.1.jar";
        String classNameToCheck = "com.aventstack.extentreports.reporter.ExtentSparkReporter";

        try (JarFile jarFile = new JarFile(new File(jarFilePath))) {
            JarEntry entry = jarFile.getJarEntry(classNameToCheck.replace('.', '/') + ".class");
            if (entry != null) {
                System.out.println("Class found in the JAR.");
            } else {
                System.out.println("Class not found in the JAR.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
