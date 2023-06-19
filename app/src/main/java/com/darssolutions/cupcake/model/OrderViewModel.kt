package com.darssolutions.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * ViewModel containing all the order details, including the quantity, flavor, date, and price.
 * This class is used to share data between the screens of the app.
 * The ViewModel is automatically retained during configuration changes by the architecture.
 */
class OrderViewModel : ViewModel() {

    private var _quantity = MutableLiveData<Int>(0)
    val quantity: LiveData<Int> = _quantity

    private var _flavor = MutableLiveData<String>("")
    val flavor: LiveData<String> = _flavor

    private var _date = MutableLiveData<String>("")
    val date: LiveData<String> = _date

    private var _price = MutableLiveData<Double>(0.0)
    val price: LiveData<Double> = _price

    fun setQuantity(numOfCakes: Int) {
        _quantity.value = numOfCakes
    }

    fun setFlavor(desiredFlavor: String) {
        _flavor.value = desiredFlavor
    }

    fun setDate(date: String) {
        _date.value = date
    }

    fun hasNoFlavorSet(): Boolean {
        return _flavor.value.isNullOrEmpty()
    }
}
