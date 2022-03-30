package com.tyss.assignmentonlinkedhashset;

import java.util.Comparator;

public class SortById implements Comparator<Student>{
	public int compare(Student o1,Student o2) {
		return o1.studentid-o2.studentid;
	}

}
