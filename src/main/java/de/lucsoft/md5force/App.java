package de.lucsoft.md5force;

/**
 * Hello world!
 */
public final class App {

    static cr4cker crack  = new cr4cker();
    public static void main(String[] args) {
        crack.crackAnHashFast(crack.getHash("lol"));
    }
}
