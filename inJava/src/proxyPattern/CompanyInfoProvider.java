package proxyPattern;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CompanyInfoProvider implements ICompanyInfo {
	
	public List<String> CachedCEOList = null;
	public List<String> CachedCompanyList = null;
	public List<String> CachedProfitMarginList = null;
	
	ICompanyInfo obj = null;

	@Override
	public List<String> getCEOList() {
		if (obj == null) {
			System.out.println("No cache available!");
			obj = new CompanyInfoGenerator();
		}
		
		if (CachedCEOList == null) {
			System.out.println("CEO list is not cached yet...wait for a bit");
			CachedCEOList = obj.getCEOList();
		} else {
			System.out.println("From Proxy");
		}
		return CachedCEOList;
	}

	@Override
	public List<String> getCompanies() {
		if (obj == null) {
			System.out.println("No cache available!");
			obj = new CompanyInfoGenerator();
		}
		
		if (CachedCompanyList == null) {
			System.out.println("Company list is not cached yet...wait for a bit");
			CachedCompanyList = obj.getCompanies();
		} else {
			System.out.println("From Proxy");
		}
		return CachedCompanyList;
	}

	@Override
	public List<String> getProfitMargins() {
		if (obj == null) {
			System.out.println("No cache available!");
			obj = new CompanyInfoGenerator();
		}
		
		if (CachedProfitMarginList == null) {
			System.out.println("Profit Margin is not cached yet...wait for a bit");
			CachedProfitMarginList = obj.getProfitMargins();
		} else {
			System.out.println("From Proxy");
		}
		return CachedProfitMarginList;
	}
	
	public void clearCache() {
		System.out.println("Clearing Cache...");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CachedCEOList.clear();
		CachedCompanyList.clear();
		CachedProfitMarginList.clear();
		obj = null;
	}
	
}
