package com.news;

import java.util.List;

public interface NewsDAO {
	public List<News> getNewsData(String url);
}
