package com.pinhobrunodev.customtablepk.dtos.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.pinhobrunodev.customtablepk.dtos.Category.CategoryDTO;
import com.pinhobrunodev.customtablepk.model.Product;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
    private List<CategoryDTO> categories = new ArrayList<CategoryDTO>();

    public ProductDTO() {

    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
        categories = entity.getCategories().stream().map(CategoryDTO::new).collect(Collectors.toList());
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Double return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return String return the imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl the imgUrl to set
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * @return List<CategoryDTO> return the categories
     */
    public List<CategoryDTO> getCategories() {
        return categories;
    }

}
