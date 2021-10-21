package proxyPattern;

import java.util.ArrayList;
import java.util.List;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Iterator;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
import java.util.concurrent.TimeUnit;

public class CompanyInfoGenerator implements ICompanyInfo {
	String[][] companies = { { "whoever", "whatever", "25%" }, { "whoever2", "whatever2", "32%" }, { "whoever3", "whatever3", "15%" } };
	
	public CompanyInfoGenerator() {
		//Parse json file and save in a string array
		System.out.println("Parsing Company Profiles...");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public List<String> getCEOList() {
		List<String> CEOList = new ArrayList<>();
		for (int i = 0; i < companies.length; i++) {
			CEOList.add(companies[i][0]);
        }
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CEOList;
	}

	@Override
	public List<String> getCompanies() {
		List<String> CompanyList = new ArrayList<>();
		for (int i = 0; i < companies.length; i++) {
			CompanyList.add(companies[i][1]);
        }
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CompanyList;
	}

	@Override
	public List<String> getProfitMargins() {
		List<String> ProfitMarginList = new ArrayList<>();
		for (int i = 0; i < companies.length; i++) {
			ProfitMarginList.add(companies[i][2]);
        }
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ProfitMarginList;
	}

}
