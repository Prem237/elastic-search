package com.elastic.search.repository;

import com.elastic.search.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Repository;

@Repository
public class ElasticSearchQuery {

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    private final String indexName = "road_runner_sports";


    public SearchHits<Product> getQueryResults(String query){
        Query searchQuery = new StringQuery(
                "{\"multi_match\":{\"query\" : \""+query+"\",\"fields\": [\"pid\",\"brand\",\"display_name\",\"webPgc\",\"webSubPgc\"]}}");

        SearchHits<Product> products = elasticsearchOperations.search(
                searchQuery,
                Product.class,
                IndexCoordinates.of(indexName));
        return products;
    }
}
