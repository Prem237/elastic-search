package com.elastic.search.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.ArrayList;
import java.util.List;

@Document(indexName = "road_runner")
@Getter
@Setter
public class Product {

    @Id
    private String id;

    @Field(type = FieldType.Text, name = "shoe_size")
    private String shoe_size;

    @Field(type = FieldType.Text, name = "brand")
    private String brand;

    @Field(type = FieldType.Text, name = "colorGroup")
    private String colorGroup;

    @Field(type = FieldType.Text, name = "creation_date")
    private String creation_date;

    @Field(type = FieldType.Integer, name = "customer_rating")
    private String customer_rating;

    @Field(type = FieldType.Integer, name = "customer_reviews")
    private String customer_reviews;

    @Field(type = FieldType.Text, name = "default_color")
    private String default_color;

    @Field(type = FieldType.Text, name = "description")
    private String description;

    @Field(type = FieldType.Text, name = "disableInProductSearch")
    private String disableInProductSearch;

    @Field(type = FieldType.Text, name = "display_name")
    private String display_name;

    @Field(type = FieldType.Text, name = "drop_ship")
    private String drop_ship;

    @Field(type = FieldType.Text, name = "embed_id")
    private String embed_id;

    @Field(type = FieldType.Text, name = "extended_drop_ship")
    private String extended_drop_ship;

    @Field(type = FieldType.Text, name = "sale_price")
    private String sale_price;

    @Field(type = FieldType.Text, name = "price")
    private String price;

    @Field(type = FieldType.Integer, name = "racc_price")
    private String racc_price;

    @Field(type = FieldType.Text, name = "fit_size")
    private String fit_size;

    @Field(type = FieldType.Text, name = "shoe_type")
    private String shoe_type;

    @Field(type = FieldType.Text, name = "features_benefits")
    private String features_benefits;

    @Field(type = FieldType.Text, name = "webPgc")
    private ArrayList webPgc;

    @Field(type = FieldType.Integer, name = "umap_hide_vip")
    private String umap_hide_vip;

    @Field(type = FieldType.Integer, name = "umap_price")
    private String umap_price;

    @Field(type = FieldType.Text, name = "url")
    private String url;

    @Field(type = FieldType.Text, name = "latest_version_pid")
    private String latest_version_pid;

    @Field(type = FieldType.Text, name = "newProduct")
    private String newProduct;

    @Field(type = FieldType.Text, name = "pgc_code")
    private ArrayList pgc_code;

    @Field(type = FieldType.Text, name = "price_range")
    private ArrayList price_range;

    @Field(type = FieldType.Integer, name = "quantity_on_hand")
    private String quantity_on_hand;

    @Field(type = FieldType.Integer, name = "rac_price")
    private String rac_price;

    @Field(type = FieldType.Float, name = "reg_price")
    private String reg_price;

    @Field(type = FieldType.Integer, name = "rrs_sale")
    private String rrs_sale;

    @Field(type = FieldType.Text, name = "webSubPgc")
    private ArrayList webSubPgc;

    @Field(type = FieldType.Integer, name = "map_price")
    private String map_price;

    @Field(type = FieldType.Text, name = "long_description")
    private String long_description;

    @Field(type = FieldType.Integer, name = "map_sale_price")
    private String map_sale_price;

    @Field(type = FieldType.Integer, name = "has_video")
    private String has_video;

    @Field(type = FieldType.Text, name = "gender_text")
    private String gender_text;

    @Field(type = FieldType.Integer, name = "ranking")
    private String ranking;

    @Field(type = FieldType.Text, name = "sub_category")
    private String sub_category;

    @Field(type = FieldType.Integer, name = "gender_code")
    private String gender_code;

    @Field(type = FieldType.Text, name = "shoe_cushion")
    private String shoe_cushion;

    @Field(type = FieldType.Integer, name = "sale_price_range")
    private ArrayList sale_price_range;

    @Field(type = FieldType.Text, name = "taxable")
    private String taxable;

    @Field(type = FieldType.Text, name = "title")
    private String title;

    @Field(type = FieldType.Integer, name = "vip_price")
    private String vip_price;

    @Field(type = FieldType.Text, name = "widthGroup")
    private String widthGroup;

    @Field(type = FieldType.Text, name = "displayName")
    private String name;

    @Field(type = FieldType.Text, name = "pid")
    private String pid;

    @Field(type = FieldType.Nested, name = "variants")
    private List<Variants> variants;

}
