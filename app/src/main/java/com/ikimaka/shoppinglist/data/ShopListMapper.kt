package com.ikimaka.shoppinglist.data

import com.ikimaka.shoppinglist.domain.ShopItem
import javax.inject.Inject

class ShopListMapper @Inject constructor() {

    fun mapEntityToDbModel(shopItem: ShopItem): ShopItemDbModel = ShopItemDbModel(
        shopItem.id,
        shopItem.name,
        shopItem.count,
        shopItem.enabled
    )
    fun mapDbModelToEntity(shopItemDbModel: ShopItemDbModel): ShopItem = ShopItem(
        id = shopItemDbModel.id,
        name = shopItemDbModel.name,
        count = shopItemDbModel.count,
        enabled = shopItemDbModel.enabled
    )
    fun mapListDbModelToListEntity(list: List<ShopItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }

}