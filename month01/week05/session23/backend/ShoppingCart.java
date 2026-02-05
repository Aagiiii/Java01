
public class ShoppingCart {
    // TODO: private талбарууд зарлах
    // - itemNames (String[]) - max 10
    // - itemPrices (double[])
    // - itemQuantities (int[])
    // - itemCount (int)


    // TODO: Массивуудыг эхлүүлэх (size = 10)
    // Жишээ:
    // itemNames = new String[10];
    // itemPrices = new double[10];
    // itemQuantities = new int[10];
    // itemCount = 0;


    // TODO: addItem(String name, double price, int quantity) - бараа нэмэх
    // Хэрэв itemCount < 10 бол:
    //   - itemNames[itemCount] = name
    //   - itemPrices[itemCount] = price
    //   - itemQuantities[itemCount] = quantity
    //   - itemCount++
    //   - return true
    // Эсрэг тохиолдолд return false


    // TODO: removeItem(String name) - бараа хасах
    // Барааг олоод массиваас хасах (дараагийн элементүүдийг зөөх)


    // TODO: updateQuantity(String name, int newQuantity) - тоо өөрчлөх


    // TODO: getSubtotal() - нийлбэр
    // Бүх (price * quantity)-ийн нийлбэр


    // TODO: getTax(double taxRate) - татвар
    // subtotal * taxRate / 100


    // TODO: getTotal(double taxRate) - нийт дүн
    // subtotal + tax


    // TODO: getItemCount() - нийт барааны тоо (бүх quantity-ийн нийлбэр)


    // TODO: clear() - сагс хоослох
    // itemCount = 0


    // TODO: displayCart() - сагс хэвлэх
}
