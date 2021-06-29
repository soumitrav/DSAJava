package javacollection;

import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetExa {

	public static void main(String []args) {
		
		Comparator<Book> comp = (a,b) -> {
			if( a.name.compareTo(b.name) == 0) {
				return  b.id - a.id;
			} else{
				return b.name.compareTo(a.name);
			}
		};
		
		TreeSet<Book> set = new TreeSet<Book>(comp);
		
		set.add(new Book("ABC",1));
		set.add(new Book("CBC",2));
		set.add(new Book("BBC",4));
		set.add(new Book("FABC",1));
		set.add(new Book("FABC",0));
		
		for (Book string : set) {
			System.out.println(string);
		}
		
	
	
}
	static class Book{
		String name;
		int id;
		
		public Book(String name, int id) {
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Book [name=" + name + ", id=" + id + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
	}
}
