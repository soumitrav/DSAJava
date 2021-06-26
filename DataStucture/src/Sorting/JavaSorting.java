package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSorting {

	public static void main(String []args) {
		
		List<Score> list = new ArrayList<>();
		list.add(new Score("user1",20));
		list.add(new Score("user2",10));
		list.add(new Score("user2",30));
		
		Collections.sort(list,(a,b) -> b.getVal()-a.getVal());
		
		for(Score i : list) {
			System.out.println(i);
		}
	}
	
	static class Score{
		String user;
		Integer val;
		
		
		public Score(String user, Integer val) {
			super();
			this.user = user;
			this.val = val;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public Integer getVal() {
			return val;
		}
		public void setVal(Integer val) {
			this.val = val;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((user == null) ? 0 : user.hashCode());
			result = prime * result + ((val == null) ? 0 : val.hashCode());
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
			Score other = (Score) obj;
			if (user == null) {
				if (other.user != null)
					return false;
			} else if (!user.equals(other.user))
				return false;
			if (val == null) {
				if (other.val != null)
					return false;
			} else if (!val.equals(other.val))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Score [user=" + user + ", val=" + val + "]";
		}
		
	}
}
