package it.polito.unitTests;

import java.util.List;

import junit.framework.*;
import it.polito.inventory.*; 

public class ItemTest extends TestCase{
	
	Item i1, i2, i3, i4, i5, i6;
	Supplier s1, s2;
	
	@Override
	public void setUp(){
		i1 = new Item("111111", 1);
		i2 = new Item("222222", 2);
		i3 = new Item("333333", 3);
		i4 = new Item("444444", 4);
		i5 = new Item("555555", 5);
		i6 = new Item("666666", 6);
		s1 = new Supplier("s1","Torino");
		s2 = new Supplier("s2", "Milano");
	}
	
	@Override
	public void tearDown(){
		i1 = null;
		i2 = null;
		i3 = null;
		i4 = null;
		i5 = null;
		i6 = null;
		s1 = null;
		s2 = null;
	}
	
	public void testGetItemCode(){
		String s;
		
		s = i1.getItemCode();
		assertEquals("Item code of item i1 should be \"111111\"","111111", s);
		s = i2.getItemCode();
		assertEquals("222222", s);
		s = i3.getItemCode();
		assertEquals("333333", s);
		s = i4.getItemCode();
		assertEquals("444444", s);
		s = i5.getItemCode();
		assertEquals("555555", s);
		s = i6.getItemCode();
		assertEquals("666666", s);
	}
	
	public void testSetItemCode(){
		String s;
		
		i1.setItemCode("123456");
		s = i1.getItemCode();
		assertEquals("New i1 item code should be \"123456\"","123456", s);
	}
	
	public void testGetAvailability(){
		int a;
		
		a = i1.getAvailability();
		assertEquals("Availability of i1 should be \"1\"",1, a);
	}
	
	public void testSetAvailability(){
		int a;
		
		i1.setAvailability(5);
		a = i1.getAvailability();
		assertEquals("New i1 availability should be \"5\"",5, a);
	}
	
	public void testGetDescription(){
		String s = null;
		
		s = i1.getDescription();
		assertNull("Item i1 description should be null since no setter has been invoked yet",s);
		s = "Description of item i1: Rounded and tasty = pizza!";
		i1.setDescription(s);
		assertEquals("The description of item i1 should be like the one stored in s",s, i1.getDescription());
	}
	
	public void testSetDescription(){
		String s = null;
		
		//s = i1.getDescription();
		//assertNull("Item i1 description should be null since no setter has been invoked yet",s);
		s = "Description of item i1: Rounded and tasty = pizza!";
		i1.setDescription(s);
		assertEquals("The description of item i1 should be like the one stored in s",s, i1.getDescription());
	}
	
	public void testGetName(){
		String s = null;
		
		s = i1.getName();
		assertNull("Item i1 name should be null since no setter has been invoked yet",s);
		s = "pizza";
		i1.setName(s);
		assertEquals("The name of item i1 should be \"pizza\"",s, i1.getName());
	}
	
	public void testSetName(){
		String s = null;
		
		s = "pizza";
		i1.setName(s);
		assertEquals("The name of item i1 should be \"pizza\"",s, i1.getName());
	}
	
	public void testAddSupplier(){
		List<Supplier> l;
		
		l=i2.getSuppliers();
		assertEquals("No supplier defined yet for i2",0,l.size());
		i2.addSupplier(s1);
		assertEquals("Supplier s1 added to i2",1,l.size());
	}
	
}
