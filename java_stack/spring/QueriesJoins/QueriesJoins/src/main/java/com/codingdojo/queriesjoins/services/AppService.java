package com.codingdojo.queriesjoins.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.queriesjoins.models.Country;
import com.codingdojo.queriesjoins.models.Language;
import com.codingdojo.queriesjoins.repositories.CountryRepository;

@Service
public class AppService {

	@Autowired
	private CountryRepository countryRepository;

	public List<Object[]> one() {
		return countryRepository.one();
	}

	public List<Object[]> tow() {
		return countryRepository.tow();
	}

	public List<Object[]> three() {
		return countryRepository.three();
	}

	public List<Object[]> four() {
		return countryRepository.four();
	}

	public List<Object[]> five() {
		return countryRepository.five();
	}

	public List<Object[]> six() {
		return countryRepository.six();
	}

	public List<Object[]> seven() {
		return countryRepository.seven();
	}

	public List<Object[]> eight() {
		return countryRepository.eight();
	}
}
