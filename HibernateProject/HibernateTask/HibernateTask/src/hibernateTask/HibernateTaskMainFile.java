package hibernateTask;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateTaskMainFile 
{
	static AnnotationConfiguration ac = new AnnotationConfiguration().configure();
	static SessionFactory sf = ac.buildSessionFactory();
	
	public static void saveCatagorySubCategory()
	{
		Session sn = sf.openSession();
		
		Categories cat1 = new Categories();
		cat1.setCatID(754);
		cat1.setCatName("Electronic");
		
		Categories cat2 = new Categories();
		cat2.setCatID(755);
		cat2.setCatName("Clothes");
		
		SubCategories sbcat1 = new SubCategories();
		sbcat1.setSubCatID(501);
		sbcat1.setSubCatName("Mobiles & Accessories");
		
		SubCategories sbcat2 = new SubCategories();
		sbcat2.setSubCatID(502);
		sbcat2.setSubCatName("Computers & Accessories");
		
		SubCategories sbcat3 = new SubCategories();
		sbcat3.setSubCatID(503);
		sbcat3.setSubCatName("Mens");
		
		SubCategories sbcat4 = new SubCategories();
		sbcat4.setSubCatID(504);
		sbcat4.setSubCatName("Womens");
		
		Set<SubCategories> s1  = new HashSet<SubCategories>();
		s1.add(sbcat1);
		s1.add(sbcat2);
		
		Set<SubCategories> s2 = new HashSet<SubCategories>();
		s2.add(sbcat3);
		s2.add(sbcat4);
		
		cat1.setSubCategaries(s1);
		cat2.setSubCategaries(s2);
		
		sn.save(cat1);
		sn.save(cat2);
		
		Transaction tr = sn.beginTransaction();
		tr.commit();
		sn.close();
	}
	
	public static void saveSubCategoryBrands()
	{
		Session sn = sf.openSession();
		Transaction tr = sn.beginTransaction();
		SubCategories sc1 = (SubCategories) sn.get(SubCategories.class, "Mobiles & Accessories");
			
		Brands br1 = new Brands();
		br1.setBrandID(764);
		br1.setBrandName("samsung");
			
		Brands br2 = new Brands();
		br2.setBrandID(765);
		br2.setBrandName("Oppo");
			
			
		Set<Brands> s1 = new HashSet<Brands>();
		s1.add(br1);
		s1.add(br2);
			
		sc1.setBrands(s1);
			
		sn.save(sc1);
		
			SubCategories sc2 = (SubCategories) sn.get(SubCategories.class, "Computers & Accessories");
			
			Brands br3 = new Brands();
			br3.setBrandID(766);
			br3.setBrandName("Dell");
			
			Brands br4 = new Brands();
			br4.setBrandID(767);
			br4.setBrandName("Mac");
			
			Brands br5 = new Brands();
			br5.setBrandID(768);
			br5.setBrandName("Asus");
			
			
			Set<Brands> s2 = new HashSet<Brands>();
			s2.add(br3);
			s2.add(br4);
			s2.add(br5);
			
			sc2.setBrands(s2);
			
			sn.save(sc2);
		
			SubCategories sc3 = (SubCategories) sn.get(SubCategories.class ,"Mens");
			
			Brands br6 = new Brands();
			br6.setBrandID(769);
			br6.setBrandName("Blue Art");
			
			Brands br7 = new Brands();
			br7.setBrandID(770);
			br7.setBrandName("Being Human");
			
			Set<Brands> s3 = new HashSet<Brands>();
			s3.add(br6);
			s3.add(br7);
			
			sc3.setBrands(s3);
			
			sn.save(sc3);
		
			SubCategories sc4 = (SubCategories) sn.get(SubCategories.class, "Womens");
			
			Brands br8 = new Brands();
			br8.setBrandID(771);
			br8.setBrandName("Crescent");
			
			Brands br9 = new Brands();
			br9.setBrandID(772);
			br9.setBrandName("Max");
			
			Set<Brands> s4 = new HashSet<Brands>();
			s4.add(br8);
			s4.add(br9);
			
			sc4.setBrands(s4);
			
			sn.save(sc4);
		
		tr.commit();
		sn.close();
	}

	public static void saveBrandsProduct()
	{
		Session sn3 = sf.openSession();
		Transaction tr3 = sn3.beginTransaction(); 
		
			Brands sc1 = (Brands) sn3.get(Brands.class, "Asus");
			
			Product pd1 = new Product();
			pd1.setProd_id(32545);
			pd1.setProd_name("ASUS VivoBook E403SA-US21 14 FHD lightweight Laptop");
			pd1.setProd_price(49890);
			
			Product pd2 = new Product();
			pd2.setProd_id(32550);
			pd2.setProd_name("ASUS ZenBook UX305CA 13.3-Inch Touchscreen Quad-HD+ Laptop");
			pd2.setProd_price(84790);
			
			Product pd3 = new Product();
			pd3.setProd_id(32555);
			pd3.setProd_name("ASUS P5G41T-M-LX3 Intel 775 Socket Ddr3 Ram Motherboard");
			pd3.setProd_price(2799);
			
			Set<Product> st1 = new HashSet<Product>();
			st1.add(pd1);
			st1.add(pd2);
			st1.add(pd3);
			
			sc1.setProduct(st1);
			
			sn3.save(sc1);
			
			Brands br2 = (Brands) sn3.get(Brands.class, "Dell");
			
			Product pd4 = new Product();
			pd4.setProd_id(32560);
			pd4.setProd_name("DELL INSPIRON 5559 6TH GEN I5 1TB HDD 8GB RAM WIN 10 15.6 FULL HD TOUCH SCREEN");
			pd4.setProd_price(44999);
			
			Product pd5 = new Product();
			pd5.setProd_id(32565);
			pd5.setProd_name("Dell 3268 Vostro 7thGenCorei3,4GB RAM,1TB HDD,Windows10 18.5 Monitor Desktop PC");
			pd5.setProd_price(40990);
			
			Set<Product> st2 = new HashSet<Product>();
			st2.add(pd4);
			st2.add(pd5);
			
			br2.setProduct(st2);
			
			sn3.save(br2);
		
			Brands br3 = (Brands) sn3.get(Brands.class, "Mac");
			
			Product pd6 = new Product();
			pd6.setProd_id(32570);
			pd6.setProd_name("Apple MacBook Air MJVM2LL/A 11.6-Inch laptop(1.6 GHz Intel i5, 128 GB SSD");
			pd6.setProd_price(75290);
			
			Product pd7 = new Product();
			pd7.setProd_id(32575);
			pd7.setProd_name("Apple MacBook Air MQD32HN/A 13.3-inch Laptop '17 (Core i5/8GB/128GB/MacOS Sierra");
			pd7.setProd_price(60500);
			
			Set<Product> st3 = new HashSet<Product>();
			st3.add(pd6);
			st3.add(pd7);
			
			br3.setProduct(st3);
			
			sn3.save(br3);

			Brands br4 = (Brands) sn3.get(Brands.class, "samsung");
			
			Product pd8 = new Product();
			pd8.setProd_id(32580);
			pd8.setProd_name("New Samsung Galaxy S8 Midnight Black, 64 GB");
			pd8.setProd_price(43590);
			
			Product pd9 = new Product();
			pd9.setProd_id(32585);
			pd9.setProd_name("Samsung Galaxy J7 Max (Gold) Duos 32GB 4GB 5.7");
			pd9.setProd_price(14495);
			
			Set<Product> st4 = new HashSet<Product>();
			st4.add(pd8);
			st4.add(pd9);
			
			br4.setProduct(st4);
			
			sn3.save(br4);
		
			Brands br5 = (Brands) sn3.get(Brands.class, "Oppo");
			
			Product pd10 = new Product();
			pd10.setProd_id(32590);
			pd10.setProd_name("Oppo F3 Plus Dual 64GB 4GB 16MP 16MP+8MP Dual Selfie Gold");
			pd10.setProd_price(15749);
			
			Product pd11 = new Product();
			pd11.setProd_id(32595);
			pd11.setProd_name("Oppo F5 32GB 4GB RAM 16MP 20MP Dual 6");
			pd11.setProd_price(19800);
			
			Set<Product> st5 = new HashSet<Product>();
			st5.add(pd10);
			st5.add(pd11);
			
			br5.setProduct(st5);
			
			sn3.save(br5);
			
			Brands br6 = (Brands) sn3.get(Brands.class, "Being Human");
			
			Product pd12 = new Product();
			pd12.setProd_id(32600);
			pd12.setProd_name("Men's Premium T-Shirt Being Bhai fan T Shirt");
			pd12.setProd_price(349);
			
			Product pd13 = new Product();
			pd13.setProd_id(32605);
			pd13.setProd_name("Men's Full Sleeves T-Shirt Salman Khan Being Bhai fan T Shirts");
			pd13.setProd_price(499);
			
			Set<Product> st6 = new HashSet<Product>();
			st6.add(pd12);
			st6.add(pd13);
			
			br6.setProduct(st6);
			
			sn3.save(br6);
		
			Brands br7 = (Brands) sn3.get(Brands.class, "Blue Art");
			
			Product pd14 = new Product();
			pd14.setProd_id(32610);
			pd14.setProd_name("Mens Shirt Blue Art");
			pd14.setProd_price(1299);
			
			Product pd15 = new Product();
			pd15.setProd_id(32615);
			pd15.setProd_name("Cristiano Ronaldo Full sleeves Cool Blue Art");
			pd15.setProd_price(999);
			
			Set<Product> st7 = new HashSet<Product>();
			st7.add(pd14);
			st7.add(pd15);
			
			br7.setProduct(st7);
			
			sn3.save(br7);
		
			Brands br8 = (Brands) sn3.get(Brands.class, "Crescent");
			
			Product pd16 = new Product();
			pd16.setProd_id(32620);
			pd16.setProd_name("The North Face Women's Crescent FZ Full Zip Hoodie black Heather");
			pd16.setProd_price(2499);
			
			Product pd17 = new Product();
			pd17.setProd_id(32625);
			pd17.setProd_name("Crescent White Dress Form Stitch Fix");
			pd17.setProd_price(1299);
			
			Set<Product> st8 = new HashSet<Product>();
			st8.add(pd16);
			st8.add(pd17);
			
			br8.setProduct(st8);
			
			sn3.save(br8);
		
			Brands br9 = (Brands) sn3.get(Brands.class, "Max");
			
			Product pd18 = new Product();
			pd18.setProd_id(32630);
			pd18.setProd_name("MAX Squirrely Print T-Shirt");
			pd18.setProd_price(299);
			
			Product pd19 = new Product();
			pd19.setProd_id(32635);
			pd19.setProd_name("Max Solid Men's Polo Neck Red T-Shirt");
			pd19.setProd_price(599);
			
			Set<Product> st9 = new HashSet<Product>();
			st9.add(pd18);
			st9.add(pd19);
			
			br9.setProduct(st9);
			
			sn3.save(br9);
		
		tr3.commit();
		sn3.close();
	}
	
	public static void saveProductProductDatails()
	{
		Session sn4 = sf.openSession();
		Transaction tr4 = sn4.beginTransaction();
		
			Product pd1 = (Product) sn4.get(Product.class, 32545);
			
			ProductDetails prd1 = new ProductDetails();
			prd1.setPrDetID(321);
			prd1.setProductName("ASUS VivoBook E403SA-US21 14 FHD lightweight Laptop");
			prd1.setBrand("Asus");
			prd1.setModel("Asus VivoBook");
			prd1.setPrice(49890);
			prd1.setColour("Black");
			prd1.setWarranty("One Year");
			
			prd1.setProduct(pd1);
			sn4.save(prd1);
		
			Product pd2 = (Product) sn4.get(Product.class, 32550);
			
			ProductDetails prd2 = new ProductDetails();
			prd2.setPrDetID(322);
			prd2.setProductName("ASUS ZenBook UX305CA 13.3-Inch Touchscreen Quad-HD+ Laptop");
			prd2.setBrand("Asus");
			prd2.setModel("Asus ZenBook");
			prd2.setPrice(84790);
			prd2.setColour("Silver");
			prd2.setWarranty("One Year");
			
			prd2.setProduct(pd2);
			sn4.save(prd2);
	
			Product pd3 = (Product) sn4.get(Product.class, 32555);
			
			ProductDetails prd3 = new ProductDetails();
			prd3.setPrDetID(323);
			prd3.setProductName("ASUS P5G41T-M-LX3 Intel 775 Socket Ddr3 Ram Motherboard");
			prd3.setBrand("Asus");
			prd3.setModel("ASUS P5G41T-M-LX3 Intel 775");
			prd3.setPrice(2799);
			prd3.setColour("Black");
			prd3.setWarranty("One Year");
			
			prd3.setProduct(pd3);
			sn4.save(prd3);

			Product pd4 = (Product) sn4.get(Product.class, 32560);
			
			ProductDetails prd4 = new ProductDetails();
			prd4.setPrDetID(324);
			prd4.setProductName("DELL INSPIRON 5559 6TH GEN I5 1TB HDD 8GB RAM WIN 10 15.6 FULL HD TOUCH SCREEN");
			prd4.setBrand("Dell");
			prd4.setModel("Inspiron 5559");
			prd4.setPrice(44999);
			prd4.setColour("Black");
			prd4.setWarranty("Seller Warranty");
			
			prd4.setProduct(pd4);
			sn4.save(prd4);
			
			Product pd5 = (Product) sn4.get(Product.class, 32565);
			
			ProductDetails prd5 = new ProductDetails();
			prd5.setPrDetID(325);
			prd5.setProductName("Dell 3268 Vostro 7thGenCorei3,4GB RAM,1TB HDD,Windows10 18.5 Monitor Desktop PC");
			prd5.setBrand("DELL");
			prd5.setModel("Dell 3268 Vostro");
			prd5.setPrice(40990);
			prd5.setColour("Black");
			prd5.setWarranty("Seller Warranty");
			
			prd5.setProduct(pd5);
			sn4.save(prd5);
		
			Product pd6 = (Product) sn4.get(Product.class, 32570);
			
			ProductDetails prd6 = new ProductDetails();
			prd6.setPrDetID(326);
			prd6.setProductName("Apple MacBook Air MJVM2LL/A 11.6-Inch laptop(1.6 GHz Intel i5, 128 GB SSD");
			prd6.setBrand("Apple");
			prd6.setModel("MJVM2LL/A");
			prd6.setPrice(75290);
			prd6.setColour("White");
			prd6.setWarranty("One Year");
			
			prd6.setProduct(pd6);
			sn4.save(prd6);
		
			Product pd7 = (Product) sn4.get(Product.class, 32575);
			
			ProductDetails prd7 = new ProductDetails();
			prd7.setPrDetID(327);
			prd7.setProductName("Apple MacBook Air MQD32HN/A 13.3-inch Laptop '17 (Core i5/8GB/128GB/MacOS Sierra");
			prd7.setBrand("Apple");
			prd7.setModel("MQD32HN/A");
			prd7.setPrice(60500);
			prd7.setColour("White");
			prd7.setWarranty("One Year");
			
			prd7.setProduct(pd7);
			sn4.save(prd7);
		
			Product pd8 = (Product) sn4.get(Product.class, 32580);
			
			ProductDetails prd8 = new ProductDetails();
			prd8.setPrDetID(328);
			prd8.setProductName("New Samsung Galaxy S8 Midnight Black, 64 GB");
			prd8.setBrand("Samsung");
			prd8.setModel("Galaxy S8");
			prd8.setPrice(43590);
			prd8.setColour("Black");
			prd8.setWarranty("Seller Warranty");
			
			prd8.setProduct(pd8);
			sn4.save(prd8);
		
			Product pd9 = (Product) sn4.get(Product.class, 32585);
			
			ProductDetails prd9 = new ProductDetails();
			prd9.setPrDetID(329);
			prd9.setProductName("Samsung Galaxy J7 Max (Gold) Duos 32GB 4GB 5.7");
			prd9.setBrand("Samsung");
			prd9.setModel("Galaxy J7 MAX");
			prd9.setPrice(14495);
			prd9.setColour("Gold");
			prd9.setWarranty("Manufacturer Warranty");
			
			prd9.setProduct(pd9);
			sn4.save(prd9);

			Product pd10 = (Product) sn4.get(Product.class, 32590);
			
			ProductDetails prd10 = new ProductDetails();
			prd10.setPrDetID(330);
			prd10.setProductName("Oppo F3 Plus Dual 64GB 4GB 16MP 16MP+8MP Dual Selfie Gold");
			prd10.setBrand("Oppo");
			prd10.setModel("F3 Plus");
			prd10.setPrice(15749);
			prd10.setColour("Gold");
			prd10.setWarranty("One Year");
			
			prd10.setProduct(pd10);
			sn4.save(prd10);
		
			Product pd11 = (Product) sn4.get(Product.class, 32595);
			
			ProductDetails prd11 = new ProductDetails();
			prd11.setPrDetID(331);
			prd11.setProductName("Oppo F5 32GB 4GB RAM 16MP 20MP Dual 6");
			prd11.setBrand("Oppo");
			prd11.setModel("F5 CPH1723");
			prd11.setPrice(19800);
			prd11.setColour("Gold");
			prd11.setWarranty("Manufacturer Warranty");
			
			prd11.setProduct(pd11);
			sn4.save(prd11);
			
			Product pd12 = (Product) sn4.get(Product.class, 32600);
			
			ProductDetails prd12 = new ProductDetails();
			prd12.setPrDetID(332);
			prd12.setProductName("Men's Premium T-Shirt Being Bhai fan T Shirt");
			prd12.setBrand("Being Human");
			prd12.setModel("Premium T-Shirt");
			prd12.setPrice(349);
			prd12.setColour("Black,White");
			prd12.setWarranty("No Warranty");
			
			prd12.setProduct(pd12);
			sn4.save(prd12);
			
			Product pd13 = (Product) sn4.get(Product.class, 32605);
			
			ProductDetails prd13 = new ProductDetails();
			prd13.setPrDetID(333);
			prd13.setProductName("Men's Full Sleeves T-Shirt Salman Khan Being Bhai fan T Shirts");
			prd13.setBrand("Being Human");
			prd13.setModel(" Full Sleeves T-Shirt");
			prd13.setPrice(499);
			prd13.setColour("Black,White");
			prd13.setWarranty("No Warranty");
			
			prd13.setProduct(pd13);
			sn4.save(prd13);

			Product pd14 = (Product) sn4.get(Product.class, 32610);
			
			ProductDetails prd14 = new ProductDetails();
			prd14.setPrDetID(334);
			prd14.setProductName("Mens Shirt Blue Art");
			prd14.setBrand("Blue Art");
			prd14.setModel("Blue Art");
			prd14.setPrice(1299);
			prd14.setColour("White,Pink,Red,Yellow");
			prd14.setWarranty("No Warranty");
			
			prd14.setProduct(pd14);
			sn4.save(prd14);

			Product pd15 = (Product) sn4.get(Product.class, 32615);
			
			ProductDetails prd15 = new ProductDetails();
			prd15.setPrDetID(335);
			prd15.setProductName("Cristiano Ronaldo Full sleeves Cool Blue Art");
			prd15.setBrand("Blue Art");
			prd15.setModel("Blue Art");
			prd15.setPrice(999);
			prd15.setColour("White,Pink,Red,Yellow");
			prd15.setWarranty("No Warranty");
			
			prd15.setProduct(pd15);
			sn4.save(prd15);

			Product pd16 = (Product) sn4.get(Product.class, 32620);
			
			ProductDetails prd16 = new ProductDetails();
			prd16.setPrDetID(336);
			prd16.setProductName("The North Face Women's Crescent FZ Full Zip Hoodie black Heather");
			prd16.setBrand("Crescent");
			prd16.setModel("Crescent");
			prd16.setPrice(2499);
			prd16.setColour("Multi-Color");
			prd16.setWarranty("Seller Warranty");
			
			prd16.setProduct(pd16);
			sn4.save(prd16);

			Product pd17 = (Product) sn4.get(Product.class, 32625);
			
			ProductDetails prd17 = new ProductDetails();
			prd17.setPrDetID(337);
			prd17.setProductName("Crescent White Dress Form Stitch Fix");
			prd17.setBrand("Crescent");
			prd17.setModel("Crescent");
			prd17.setPrice(1299);
			prd17.setColour("Multi-Color");
			prd17.setWarranty("One Year");
			
			prd17.setProduct(pd17);
			sn4.save(prd17);
		
			Product pd18 = (Product) sn4.get(Product.class, 32630);
			
			ProductDetails prd18 = new ProductDetails();
			prd18.setPrDetID(338);
			prd18.setProductName("MAX Squirrely Print T-Shirt");
			prd18.setBrand("MAX");
			prd18.setModel("MAX");
			prd18.setPrice(299);
			prd18.setColour("White,Black");
			prd18.setWarranty("One Year");
			
			prd18.setProduct(pd18);
			sn4.save(prd18);
		
			Product pd19 = (Product) sn4.get(Product.class, 32635);
			
			ProductDetails prd19 = new ProductDetails();
			prd19.setPrDetID(339);
			prd19.setProductName("New Samsung Galaxy S8 Midnight Black, 64 GB");
			prd19.setBrand("MAX");
			prd19.setModel("MAX");
			prd19.setPrice(599);
			prd19.setColour("Multi-Color");
			prd19.setWarranty("Seller Warranty");
			
			prd19.setProduct(pd19);
			sn4.save(prd19);
				
		tr4.commit();
		sn4.close();
	}
	
	public static void saveProductUserdetails()
	{
		Session sn5 = sf.openSession();
		Transaction tr5 = sn5.beginTransaction();
		
			Product pd1 = (Product) sn5.get(Product.class, 32625);
			Product pd2 = (Product) sn5.get(Product.class, 32635);
			
			UserDetails ud1 = new UserDetails();
			ud1.setUserId(601);
			ud1.setUsername("Fezal");
			ud1.setPassword("fz234");
			
			UserDetails ud2 = new UserDetails();
			ud2.setUserId(602);
			ud2.setUsername("Manoj");
			ud2.setPassword("mj5");
			
			Set<UserDetails> st1 = new HashSet<UserDetails>();
			st1.add(ud1);
			st1.add(ud2);
			
			pd1.setUsers(st1);
			pd2.setUsers(st1);
			sn5.save(pd1);
			//sn5.save(pd2);
		
		tr5.commit();
		sn5.close();
	}
	
	public static void saveUserOrder()
	{
		Session sn6 = sf.openSession();
		Transaction tr6 = sn6.beginTransaction();
		
		UserDetails ud1 = (UserDetails) sn6.get(UserDetails.class, 601);
		
		OrdersDetails od1 = new OrdersDetails();
		od1.setOrderID(801);
		od1.setProductName("Oppo F3 Plus");
		od1.setLocation("Dhar");
		od1.setState("Madhya Pradesh");
		od1.setCountry("India");
		od1.setOrderDate(new Date());
		
		OrdersDetails od2 = new OrdersDetails();
		od2.setOrderID(802);
		od2.setProductName("Galaxy J7 MAX");
		od2.setLocation("Indore");
		od2.setState("Madhya Pradesh");
		od2.setCountry("India");
		od2.setOrderDate(new Date());
		
		Set<OrdersDetails> st1 = new HashSet<OrdersDetails>();
		st1.add(od1);
		st1.add(od2);
		
		ud1.setOrders(st1);
		sn6.save(ud1);
		tr6.commit();
		sn6.close();
		
		
	}
	
	public static void saveProductSeller()
	{
		Session sn7 = sf.openSession();
		Transaction tr7 = sn7.beginTransaction();
		
		Product prd1 = (Product) sn7.get(Product.class, 32545);
		Product prd2 = (Product) sn7.get(Product.class, 32550);
		Product prd3 = (Product) sn7.get(Product.class, 32555);
		Product prd4 = (Product) sn7.get(Product.class, 32575);
		Product prd5 = (Product) sn7.get(Product.class, 32630);
		
		
		SellerInformation sli1 = new SellerInformation();
		sli1.setSellerID(2012);
		sli1.setSellerName("deals24x7x365deals24x7x365");
		
		SellerInformation sli2 = new SellerInformation();
		sli2.setSellerID(2013);
		sli2.setSellerName("innovativetreasure_india");
		
		SellerInformation sli3 = new SellerInformation();
		sli3.setSellerID(2014);
		sli3.setSellerName("bestdealscare9");
		
		Set<SellerInformation> s1 = new HashSet<SellerInformation>();
		s1.add(sli1);
		s1.add(sli2);
		
		Set<SellerInformation> s2 = new HashSet<SellerInformation>();
		s2.add(sli3);
		
		prd1.setSeller(s1);
		prd2.setSeller(s1);
		prd3.setSeller(s2);
		prd4.setSeller(s1);
		prd4.setSeller(s2);
		prd5.setSeller(s1);
		prd5.setSeller(s2);
		
		sn7.save(prd1);
		sn7.save(prd2);
		sn7.save(prd3);
		sn7.save(prd4);
		sn7.save(prd5);
		
		tr7.commit();
		sn7.close();
	}
	
	public static void saveUsersPaymentsOrders()
	{
		Session sn8 = sf.openSession();
		Transaction tr8 = sn8.beginTransaction();
		
		UserDetails ud1 = (UserDetails) sn8.get(UserDetails.class, 601); 
		UserDetails ud2 = (UserDetails) sn8.get(UserDetails.class, 602); 
		
		
		OrdersDetails od1 = (OrdersDetails) sn8.get(OrdersDetails.class, 801);
		OrdersDetails od2 = (OrdersDetails) sn8.get(OrdersDetails.class, 802);
		
		Payments py1 = new Payments();
		py1.setPayID(7483);
		py1.setAmount(15749);
		py1.setUsersDetails(ud1);
		py1.setOrdersDetails(od1);
		
		Payments py2 = new Payments();
		py2.setPayID(7484);
		py2.setAmount(14795);
		py2.setUsersDetails(ud1);
		py2.setOrdersDetails(od1);
		
		Payments py3 = new Payments();
		py3.setPayID(7485);
		py3.setAmount(15749);
		py3.setUsersDetails(ud2);
		py3.setOrdersDetails(od2);
		
		Payments py4 = new Payments();
		py4.setPayID(7486);
		py4.setAmount(14795);
		py4.setUsersDetails(ud2);
		py4.setOrdersDetails(od2);
		
		sn8.save(py1);
		sn8.save(py2);
		sn8.save(py3);
		sn8.save(py4);
		
		tr8.commit();
		sn8.close();
		
	}
	
	public static void savePaymentsPaymentOptions()
	{
		Session sn9 = sf.openSession();
		Transaction tr9 = sn9.beginTransaction();
		
		Payments py1 = (Payments) sn9.get(Payments.class , 7483);
		Payments py2 = (Payments) sn9.get(Payments.class , 7484);
		
		PaymentOptions po1 = new PaymentOptions();
		po1.setPay_options_ID(481);
		po1.setBank("SBI");
		po1.setCreaditCardNo("A98GS754");
		po1.setCVVNo(34342);
		po1.setCheckNo("985458");
		
		PaymentOptions po2 = new PaymentOptions();
		po2.setPay_options_ID(482);
		po2.setBank("BOI");
		po2.setCreaditCardNo("BOI394347");
		po2.setCVVNo(654343);
		//po2.setCheckNo("32327366");
		
		PaymentOptions po3 = new PaymentOptions();
		po3.setPay_options_ID(483);
		po3.setBank("Union Bank");
	//	po3.setCreaditCardNo("UNB932734");
	//	po3.setCVVNo(94753);
		po3.setCheckNo("9848378");
		
		Set<PaymentOptions> s1 = new HashSet<PaymentOptions>();
		s1.add(po1);
		s1.add(po2);
		
		Set<PaymentOptions> s2 = new HashSet<PaymentOptions>();
		s2.add(po3);
		
		py1.setPay_option(s1);
		py2.setPay_option(s2);
		
		sn9.save(py1);
		sn9.save(py2);
		
		tr9.commit();
		sn9.close();
		
	}
	
	public static void saveOrdersDetailsDelivery()
	{
		Session sn10 = sf.openSession();
		Transaction tr10 = sn10.beginTransaction();
		
		OrdersDetails od1 = (OrdersDetails) sn10.get(OrdersDetails.class, 801);
		OrdersDetails od2 = (OrdersDetails) sn10.get(OrdersDetails.class, 802);
		
		Delievery dl1 = new Delievery();
		dl1.setDelieveryId(89457);
		dl1.setDelieveryAddress("Dhar");
		dl1.setDelieveryDate("2018-02-15");
		
		Delievery dl2 = new Delievery();
		dl2.setDelieveryId(89458);
		dl2.setDelieveryAddress("Indore");
		dl2.setDelieveryDate("2018-02-05");
		
		Delievery dl3 = new Delievery();
		dl3.setDelieveryId(89459);
		dl3.setDelieveryAddress("Dewas");
		dl3.setDelieveryDate("2018-01-25");
		
		Delievery dl4 = new Delievery();
		dl4.setDelieveryId(89460);
		dl4.setDelieveryAddress("Itarsi");
		dl4.setDelieveryDate("2018-01-05");
		
		Set<Delievery> s1 = new HashSet<Delievery>();
		s1.add(dl1);
		s1.add(dl4);
		
		Set<Delievery> s2 = new HashSet<Delievery>();
		s2.add(dl2);
		s2.add(dl3);
		s2.add(dl4);
		
		od1.setDelievery(s1);
		od2.setDelievery(s2);
		
		sn10.save(od1);
		sn10.save(od2);
		tr10.commit();
		sn10.close();
	}
	
	public static void saveUserFeedBack()
	{
		Session sn11 = sf.openSession();
		Transaction tr11 = sn11.beginTransaction();
	
		UserDetails ud1 = (UserDetails) sn11.get(UserDetails.class, 601); 
		UserDetails ud2 = (UserDetails) sn11.get(UserDetails.class, 602); 		
	
		Feedback fd1 = new Feedback();
		fd1.setFdSno(1);
		fd1.setAboutSeller("Good");
		fd1.setAboutProduct("Excellent");
		fd1.setAboutDelievery("Not Good");
		
		Feedback fd2 = new Feedback();
		fd2.setFdSno(2);
		fd2.setAboutSeller("Good");
		fd2.setAboutProduct("GOOD");
		fd2.setAboutDelievery("Good");
		
		Feedback fd3 = new Feedback();
		fd3.setFdSno(3);
		fd3.setAboutSeller("Good");
		fd3.setAboutProduct("Awesome");
		fd3.setAboutDelievery("Well");
		
		Set<Feedback> s1 = new HashSet<Feedback>();
		s1.add(fd1);
		s1.add(fd2);
		
		Set<Feedback> s2 = new HashSet<Feedback>();
		s2.add(fd2);
		s2.add(fd3);
		
		ud1.setFeedback(s1);
		ud2.setFeedback(s2);
		
		sn11.save(ud1);
		sn11.save(ud2);
		
		tr11.commit();
		sn11.close();
		
	}
	
	public static void saveUsersComplaint()
	{
		Session sn12 = sf.openSession();
		Transaction tr12 = sn12.beginTransaction();
	
		UserDetails ud1 = (UserDetails) sn12.get(UserDetails.class, 601); 
		UserDetails ud2 = (UserDetails) sn12.get(UserDetails.class, 602); 		
	
		Complain cmpl1 = new Complain();
		cmpl1.setComplainSNo(3476);
		cmpl1.setAboutProduct("mobile is not working");
		cmpl1.setAboutDelievery("delievery should be deliever at time");
		cmpl1.setAboutSeller("Charge is too High");
		
		Complain cmpl2 = new Complain();
		cmpl2.setComplainSNo(3477);
		cmpl2.setAboutProduct("products is not same");
		cmpl2.setAboutDelievery("delievery should be deliever at time");
		cmpl2.setAboutSeller("shipping is very slow");
		
		Set<Complain> s1 = new HashSet<Complain>();
		s1.add(cmpl1);
		
		Set<Complain> s2 = new HashSet<Complain>();
		s2.add(cmpl2);
		
		
		ud1.setComplain(s1);
		ud2.setComplain(s2);
		
		sn12.save(ud1);
		sn12.save(ud2);
		
		tr12.commit();
		sn12.close();
	}
	
	public static void saveRefoundPayment()
	{
		Session sn13 = sf.openSession();
		Transaction tr13 = sn13.beginTransaction();
	
		PaymentOptions po1 = (PaymentOptions) sn13.get(PaymentOptions.class, 481);
		PaymentOptions po2 = (PaymentOptions) sn13.get(PaymentOptions.class, 482);
		
		RefundOrReplace rf1 = new RefundOrReplace();
		rf1.setReID(84574);
		rf1.setRefoundAmount(15749);
		rf1.setReplaceProduct("Oppo F3 Plus");
		rf1.setPay_option(po1);
		
		RefundOrReplace rf2 = new RefundOrReplace();
		rf2.setReID(84575);
		rf2.setRefoundAmount(14495);
		rf2.setReplaceProduct("Galaxy J7 Max");
		rf2.setPay_option(po2);
		
		sn13.save(rf1);
		sn13.save(rf2);
		
		tr13.commit();
		sn13.close();
		
	}
	
	public static void saveOfferProduct()
	{
		Session sn14 = sf.openSession();
		Transaction tr14 = sn14.beginTransaction();
		
		Product prd1 = (Product) sn14.get(Product.class, 32585);
		Product prd2 = (Product) sn14.get(Product.class, 32625);
		
		Offers of1 = new Offers();
		of1.setOfferID(849);
		of1.setBasePrice(14495);
		of1.setOffers(13599);
		of1.setProduct(prd1);
		
		Offers of2 = new Offers();
		of2.setOfferID(850);
		of2.setBasePrice(1299);
		of2.setOffers(999);
		of2.setProduct(prd2);
		
		sn14.save(of1);
		sn14.save(of2);
		
		tr14.commit();
		sn14.close();
		
	}
	
	public static  void getCatagorySubCategory()
	{
		Session sn = sf.openSession();
		Query qr = sn.createQuery("from Categories");
		List<?> l1 = qr.list();
		Iterator<?> it = l1.iterator();
		while(it.hasNext())
		{
			Categories sc1 = (Categories) it.next();
			System.out.println("------Categoreis--------");
			System.out.println("ID: "+sc1.getCatID());
			System.out.println("Name: "+sc1.getCatName());
			System.out.println("--------------------");
			
			Set<?> pr = sc1.getSubCategaries();
			Iterator<?> it1 = pr.iterator();
			while (it1.hasNext())
			{
				SubCategories pl = (SubCategories) it1.next();
				System.out.println("-------SubCategories-------------");
				System.out.println("ID: "+pl.getSubCatID());
				System.out.println("Name: "+pl.getSubCatName());
				System.out.println("Categories: "+pl.getCategory_Name());
				
			}
			
		}
		sn.close();	
	}
	
	public static void getSubCategoryBrands()
	{
		Session sn = sf.openSession();
		Query qr = sn.createQuery("from SubCategories");
		List<?> l1 = qr.list();
		Iterator<?> it = l1.iterator();
		while(it.hasNext())
		{
			SubCategories sc1 = (SubCategories) it.next();
			System.out.println("-------SubCategories-------------");
			System.out.println("ID: "+sc1.getSubCatID());
			System.out.println("Name: "+sc1.getSubCatName());
			System.out.println("Categories: "+sc1.getCategory_Name());
			System.out.println("----------------------------------");
			Set<?> pr1 = sc1.getBrands();
			Iterator<?> it1 = pr1.iterator();
			while (it1.hasNext())
			{
				Brands br = (Brands) it1.next();
				System.out.println("-------Brands-------------");
				System.out.println("ID: "+br.getBrandID());
				System.out.println("Name: "+br.getBrandName());
				System.out.println("Product: "+br.getSubCategories());
				System.out.println("--------------------");
			}
		}
		sn.close();
	}
	
	public static void getBrandsProduct()
	{
		Session sn3 = sf.openSession();
		Query qr = sn3.createQuery("from Brands");
		List<?> l1 = qr.list();
		Iterator<?> it = l1.iterator();
		while(it.hasNext())
		{
			Brands br = (Brands) it.next();
			System.out.println("-------Brands-------------");
			System.out.println("ID: "+br.getBrandID());
			System.out.println("Name: "+br.getBrandName());
			System.out.println("Product: "+br.getSubCategories());
			System.out.println("--------------------");
			
			Set<?> pr1 = br.getProduct();
			Iterator<?> it1 = pr1.iterator();
			while (it1.hasNext())
			{
			
				Product pd1 = (Product) it1.next();
				System.out.println("-------Product-------------");
				System.out.println("ID: "+pd1.getProd_id());
				System.out.println("Name: "+pd1.getProd_name());
				System.out.println("Price: "+pd1.getProd_price());
				System.out.println("--------------------");
			}
			
		}
		sn3.close();
	}
	
	//one to many update
	public static void updateCatagorySubCategory()
	{
		Session sn = sf.openSession();
		
			Categories sc1 = (Categories) sn.get(Categories.class, "Clothes");
			SubCategories sb1 = (SubCategories) sn.get(SubCategories.class, "Mens");
			sb1.setSubCatID(440);
			
			
			Set<SubCategories> s1 = new HashSet<SubCategories>();
			s1.add(sb1);
			
			sc1.setSubCategaries(s1);
			Transaction tr1 = sn.beginTransaction();
			sn.update(sc1);
			tr1.commit();
		
		
		sn.close();
	}
	
	// one to one update
		public static void updateProductProductDatails()
		{
			Session sn = sf.openSession();
			Transaction tr = sn.beginTransaction();
			
			Product p2 = (Product) sn.get(Product.class, 32545);
			
			ProductDetails pd2 = (ProductDetails) sn.get(ProductDetails.class, 321);
			pd2.setColour("Black,Silver");
			
			//sn.update(pd2);
			sn.update(p2);
			tr.commit();
			sn.close();
			
		}
		
	//many to many
		public static void updateProductUserdetails()
		{
			Session sn = sf.openSession();
			Transaction tr = sn.beginTransaction();
			
			Product p2 = (Product) sn.get(Product.class, 32565);
			
			UserDetails ud1 = (UserDetails) sn.get(UserDetails.class, 601);
			ud1.setUsername("Pareshan");
			
			UserDetails ud2 = (UserDetails) sn.get(UserDetails.class, 602);
			ud2.setUsername("Ankita");
			
			Set<UserDetails> st1 = new HashSet<UserDetails>();
			st1.add(ud1);
			st1.add(ud2);
			
			p2.setUsers(st1);
			
			sn.update(p2);
			tr.commit();
			sn.close();
			
		}
		
		
	public static void deleteCatagorySubCategory()
	{
		Session sn = sf.openSession();
		Transaction tr = sn.beginTransaction();
		Query qr = sn.createQuery("from Categories");
		List<?> l1 = qr.list();
		Iterator<?> it = l1.iterator();
		while(it.hasNext())
		{
			Categories sc1 = (Categories) it.next();
			Set<?> pr = sc1.getSubCategaries();
			Iterator<?> it1 = pr.iterator();
			while (it1.hasNext())
			{
				SubCategories pl = (SubCategories) it1.next();
				sn.delete(pl);
			}
		}
		tr.commit();
		sn.close();
	}
	
	
	
	public static void main(String[] args) 
	{
		//saveCatagorySubCategory();
		//saveSubCategoryBrands();
		//saveBrandsProduct();
		//saveProductProductDatails();
		//saveProductUserdetails();
		//saveUserOrder();
		//saveProductSeller();
		//saveUsersPaymentsOrders();
		//savePaymentsPaymentOptions();
		//saveOrdersDetailsDelivery();
		//saveUserFeedBack();
		//saveUsersComplaint();
		//saveRefoundPayment();
		//saveOfferProduct();
		
			/*GET OPERATION*/
		getCatagorySubCategory();
		getSubCategoryBrands();
		getBrandsProduct();
		
			/*UPDATE OPREATION*/
		//updateCatagorySubCategory();
		//updateProductProductDatails();
		//updateProductUserdetails();
		
		
		/*DELETE OPERATION*/
		//deleteCatagorySubCategory();
	}

}
