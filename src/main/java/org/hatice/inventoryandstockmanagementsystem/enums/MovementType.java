package org.hatice.inventoryandstockmanagementsystem.enums;

public enum MovementType {
	INCOMING,        // Yeni stok girişi veya stok yenileme
	OUTGOING,        // Satış veya başka sebeplerle stok azalması
	ADJUSTMENT,      // Stok düzeltmeleri için manuel ayarlama
	TRANSFER,        // Depolar veya lokasyonlar arasında stok transferi
	RETURN,          // Müşteriden iade veya tedarikçiye ürün iadesi
	DAMAGE,          // Hasar veya bozulma nedeniyle stok azalması
	EXPIRATION       // Son kullanma tarihi geçen ürünler nedeniyle stok azalması
}