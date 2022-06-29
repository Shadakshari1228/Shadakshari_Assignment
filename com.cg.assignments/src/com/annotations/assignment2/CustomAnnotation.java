package com.annotations.assignment2;

import java.lang.annotation.Annotation;

public class CustomAnnotation {
	public static void main(String[] args) {

		PersionalInfo p = new PersionalInfo("Ganesh", 22);

		p.Data("Dinesh");

		Class c = p.getClass();
		Annotation an = c.getAnnotation(Info.class);
		Info i = (Info) an;
		System.out.println(i.Author());
		System.out.println(i.Supervisor());
		System.out.println(i.AuthorID());
		System.out.println(i.Date());

	}
}
