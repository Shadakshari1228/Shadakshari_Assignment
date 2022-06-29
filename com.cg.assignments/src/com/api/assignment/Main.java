package com.api.assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		List<Fruit> Fruit_list = new LinkedList<>();
		Fruit_list.add(new Fruit("Apple", 15, 265, "red"));
		Fruit_list.add(new Fruit("mango", 190, 287, "Yellow"));
		Fruit_list.add(new Fruit("JackFruit", 140, 145, "Red"));
		Fruit_list.add(new Fruit("Banana", 20, 229, "yellow"));
		
		System.out.println("Fruits with calories less than 100");
		Fruit_list.stream().filter(x -> x.getCalories() < 100).map(Fruit::getName).forEach(System.out::println);
		
		System.out.println("Sorting fruits according to their color");
		Fruit_list.stream().sorted(Comparator.comparing(Fruit::getColor)).map(Fruit::getName)
				.forEach(System.out::println);
		
		System.out.println("Only red color fruits");
		Fruit_list.stream().filter(x -> x.getColor().contains("red")).forEach(System.out::println);

		List<News> News_list = new LinkedList<>();
		News_list.add(new News(12, "User1", "This is good", "Time spent well"));
		News_list.add(new News(12, "User2", "Well done budget", "Good Presentation"));
		News_list.add(new News(12, "User3", "Very well done", "This was amazing"));
		News_list.add(new News(13, "User1", "This was informational budget", "Liked the author"));
		
		System.out.println("News ID with maximum comment");
		News_list.stream().max(Comparator.comparing(News::getCommentByUser).reversed()).ifPresent(System.out::println);
		
		System.out.println("Counting the word budget in comment");
		int count = (int) News_list.stream().filter(x -> x.getCommentByUser().contains("budget")).count();
		System.out.println("No. of time word Budget Appeared: " + count);
		
		Optional<String> max = News_list.stream().map(News::getCommentByUser).max((i, j) -> i.compareTo(j));
		System.out.println(max.get());
		
		System.out.println("7.print get comment by user");
		News_list.stream().max(Comparator.comparing(News::getNewsId).reversed()).map(News::getCommentByUser)
				.ifPresent(System.out::println);

		List<Trader> Trader_list = new LinkedList<>();
		Trader_list.add(new Trader("Aju", "bengaluru"));
		Trader_list.add(new Trader("Shanu", "mumbai"));
		Trader_list.add(new Trader("Som", "ramnagara"));
		Trader_list.add(new Trader("Virat", "delhi"));
		Trader_list.add(new Trader("Rahul", "gujarat"));
		Trader_list.add(new Trader("Hardik", "panjab"));
		
		System.out.println("Unique cities where trader work from");
		Trader_list.stream().map(Trader::getCity).distinct().forEach(System.out::println);
		
		System.out.println("Trader in mumbai");
		Trader_list.stream().filter(x -> x.getCity().contains("mumbai")).forEach(System.out::println);
		
		System.out.println("Trader name sorted alphabetical");
		Trader_list.stream().sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
		
		boolean checkramnagara= Trader_list.stream().anyMatch(x -> x.getCity().contains("ramnagara"));
		System.out.println("Are there any trader based in ramnagara: " + checkramnagara);

		List<Transaction> Trans_list = Arrays.asList(new Transaction(new Trader("Virat", "delhi"), 2016, 8900),
				new Transaction(new Trader("Hardik", "gujarat"), 2020, 6700),
				new Transaction(new Trader("Aju", "Indore"), 2021, 3450));
		
		System.out.println("Transaction of year 2016");
		Trans_list.stream().filter(x -> x.getYear() == 2016).sorted(Comparator.comparing(Transaction::getValue))
				.forEach(System.out::println);

		
		System.out.println("Transaction from traders living in delhi");
		Trans_list.stream().filter(x -> x.getT().getCity().contains("delhi")).map(Transaction::getValue)
				.forEach(System.out::println);

		
		System.out.println("Highest Transaction value");
		Trans_list.stream().sorted(Comparator.comparing(Transaction::getValue).reversed()).limit(1)
				.forEach(System.out::println);
		
		System.out.println("Transaction with smallest value");
		Trans_list.stream().sorted(Comparator.comparing(Transaction::getValue)).limit(1).forEach(System.out::println);
	}
}
