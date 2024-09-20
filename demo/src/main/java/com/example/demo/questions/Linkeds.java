package com.example.demo.questions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Linkeds {
	public int value;
	public Linkeds next;

	public static void main(String[] args) {
	
		Linkeds l= new Linkeds();
		l.insert(5, l);
		System.out.println(l.search(8, l));
		l.prin(l);
	}
	public Linkeds insert(int value, Linkeds l) {
		Linkeds temp=l;
		if(temp==null) {
			l.setValue(value);
		}
		
		else
		{
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			Linkeds l1=new Linkeds();
			l1.setValue(value);
			temp.setNext(l1);
		}
		return l;
	}
	public Linkeds delete(int value, Linkeds l) {
		if(l==null) {
			return l;
		}
		else if(l.getValue()==value) {
			l=l.getNext();
		}
		else 
		{Linkeds temp=l;
			while(temp.getNext().getValue()!=value) {
				temp=temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		return l;
	}
	public boolean search(int value, Linkeds l) {
		if(l==null) {
			return false;
		}
		else if(l.getValue()==value) {
			return true;
		}
		else 
		{Linkeds temp=l;
			while(temp!=null) {
				if(temp.getValue()==value) {
					return true;
				}
				temp=temp.getNext();
			}
		}
		return false;
	}
	public void prin(Linkeds l) {
		Linkeds temp=l;
			while(temp!=null) {
				System.out.print(temp.getValue()+"hello");
				temp=temp.getNext();
			}
	}
	
}
