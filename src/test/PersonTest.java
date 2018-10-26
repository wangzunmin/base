package test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
	public static void main(String[] args) {
		List<Person> people= new ArrayList<Person>();
		people.add(new Person("tom", 11));
		people.add(new Person("tom", 11));
		System.out.println(people.size());
	}
	
	public   static   List  removeDuplicate(List list)  {       
		  for  ( int  i  =   0 ; i  <  list.size()  -   1 ; i ++ )  {       
		      for  ( int  j  =  list.size()  -   1 ; j  >  i; j -- )  {       
		           if  (list.get(j).equals(list.get(i)))  {       
		        	   	list.remove(j);       
		            }        
		        }        
		      }        
		    return list;       
		}  
}
