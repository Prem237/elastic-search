package com.elastic.search.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "road_runner")
@Getter
@Setter
public class Variants {
    @Field(type = FieldType.Text, name = "shoe_size")
    private String shoe_size;

    @Field(type = FieldType.Text, name = "colorGroup")
    private String colorGroup;

    @Field(type = FieldType.Text, name = "creation_date")
    private String creation_date;

    @Field(type = FieldType.Text, name = "display_name")
    private String display_name;

    @Field(type = FieldType.Text, name = "drop_ship")
    private String drop_ship;

    @Field(type = FieldType.Text, name = "extended_drop_ship")
    private String extended_drop_ship;

    @Field(type = FieldType.Text, name = "quantity_on_hand")
    private String quantity_on_hand;

    @Field(type = FieldType.Text, name = "rac_price")
    private String rac_price;

    @Field(type = FieldType.Text, name = "ref_color_code")
    private String ref_color_code;

    @Field(type = FieldType.Text, name = "reg_price")
    private String reg_price;

    @Field(type = FieldType.Text, name = "sku_color")
    private String sku_color;

    @Field(type = FieldType.Integer, name = "sku_price")
    private String sku_price;

    @Field(type = FieldType.Integer, name = "sku_sale_price")
    private String sku_sale_price;

    @Field(type = FieldType.Text, name = "skuid")
    private String skuid;

    @Field(type = FieldType.Text, name = "taxable")
    private String taxable;

    @Field(type = FieldType.Text, name = "umap_price")
    private String umap_price;

    @Field(type = FieldType.Text, name = "vip_price")
    private String vip_price;

    @Field(type = FieldType.Text, name = "widthGroup")
    private String widthGroup;


}
