package de.lucsoft.md5force;

/**
 * Hello world!
 */
public final class App {

    static Cracker crack  = new Cracker();
    public static void main(String[] args) {
        crack.crackAnHashFast(crack.getHash("lol"));
    }
}
