package Exercise4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class News implements INews {
    private int id;

    private String title;

    private LocalDate publishDate;

    private String author;

    private String content;

    private double averageRate;

    private int[] rateList = new int[] { 0, 0, 0};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public int[] getRateList() {
        return rateList;
    }

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    public News() {
    }

    public News(String title, LocalDate publishDate, String author, String content) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tInput info news: ");

        System.out.println("Input title: ");
        title = scanner.nextLine();

        System.out.println("Input publish date with format yyyy/MM/dd: ");
        publishDate = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        scanner.nextLine();

        System.out.println("Input author: ");
        author = scanner.nextLine();

        System.out.println("Input content: ");
        content = scanner.nextLine();
    }

    public void inputRateList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tInput rate list: ");

        for (int i = 0; i < rateList.length; i++) {
            boolean check = true;

            do {
                System.out.print("Rate " + i + ": ");
                rateList[i] = scanner.nextInt();

                if (rateList[i] < 0 || rateList[i] > 10) {
                    System.out.println("Input rate must between 0 -> 10");
                    check = false;
                }
                else {
                    check = true;
                }
            } while (!check);
        }
    }

    public void calculate() {
        this.averageRate = (double) Arrays.stream(rateList).sum() / rateList.length;
    }
    @Override
    public void display() {
        System.out.println("-------- Info news --------");
        System.out.println("Title: " + this.title);
        System.out.println("Publish Date: " + this.publishDate);
        System.out.println("Author: " + this.author);
        System.out.println("Content: " + this.content);
        System.out.println("Average Rate: " + Math.round(this.averageRate * 10) / 10);
        System.out.println("---------------------------");
        System.out.println();
    }
}
