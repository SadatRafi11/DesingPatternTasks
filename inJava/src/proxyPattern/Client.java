package proxyPattern;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		CompanyInfoProvider companyInfo = new CompanyInfoProvider();
		
		List<String> ceoList = companyInfo.getCEOList();
		System.out.println(ceoList);
		ceoList = companyInfo.getCEOList();
		System.out.println(ceoList);
		
		List<String> companyList = companyInfo.getCompanies();
		System.out.println(companyList);
		companyList = companyInfo.getCompanies();
		System.out.println(companyList);
		
		List<String> profitMargins = companyInfo.getProfitMargins();
		System.out.println(profitMargins);
		profitMargins = companyInfo.getProfitMargins();
		System.out.println(profitMargins);
		
//		companyInfo.clearCache();
		
	}

}
