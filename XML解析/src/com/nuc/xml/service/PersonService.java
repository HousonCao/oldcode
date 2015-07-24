package com.nuc.xml.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

import com.nuc.xml.person.Person;

import android.annotation.SuppressLint;
import android.util.Xml;

@SuppressLint("UseValueOf")
public class PersonService {
	public static List<Person> getPersons(InputStream stream) throws Exception {
		List<Person> persons = null;
		Person person = null;
		// ͨ��Xml������õ�XmlPullParser������
		XmlPullParser parser = Xml.newPullParser();
		// ���ý�������
		parser.setInput(stream, "UTF-8");
		// �õ��¼�����
		int event = parser.getEventType();
		// ������ﵽ�ĵ���β��������һ���¼�
		while (event != XmlPullParser.END_DOCUMENT) {
			switch (event) {
			// ��ʼ�ĵ��¼�
			case XmlPullParser.START_DOCUMENT:
				persons = new ArrayList<Person>();
				break;
			case XmlPullParser.START_TAG:
				if ("persons".equals(parser.getName())) {
					person = new Person();
					Integer id = new Integer(parser.getAttributeValue(0));
					person.setId(id);
				}
				if (person != null) {
					if ("name".equals(parser.getName())) {
						String name = parser.nextText();
						person.setName(name);
					}
					if ("gender".equals(parser.getName())) {
						String gender = parser.nextText();
						person.setGender(gender);
					}
					if ("address".equals(parser.getName())) {
						String address = parser.nextText();
						person.setAddress(address);
					}
					if ("email".equals(parser.getName())) {
						String email = parser.nextText();
						person.setEmail(email);
					}
				}
				break;
			case XmlPullParser.END_TAG:
				if ("persons".equals(parser.getName())) {
					persons.add(person);
					person = null;
				}
				break;
			}
			// ������һ���¼�
			event = parser.next();
		}
		return persons;
	}
}