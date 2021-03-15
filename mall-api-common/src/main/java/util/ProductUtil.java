package util;

import entity.Product;
import entity.ProductForShopping;
import entity.ShoppingcartItem;

/**
 * @author LuBaby
 * @date 2021/3/8 18:08
 */
public class ProductUtil {


    public static ProductForShopping forShopping(Product product, ShoppingcartItem item){
        ProductForShopping forShopping = new ProductForShopping();
        forShopping.setItemId(item.getId());
        forShopping.setProductId(product.getProductId());
        forShopping.setProductName(product.getProductName());
        forShopping.setProductPic(product.getProductPicture());
        forShopping.setMaxNum(product.getProductNum());
        forShopping.setPrice(product.getProductPrice());
        forShopping.setNum(item.getCount());
        forShopping.setCartId(item.getShoppingcartId());
        return forShopping;
    }
}
