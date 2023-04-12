function loadProducts(page, append) {
}

$.ajax({
    type: "GET",
    url: 'http://localhost:8080/rest/products?page=${page ? page:""}',
    headers: {},
    "Content-Type": "application/json",
    success: function (data) {
        renderProducts(data.content, append)
        renderLoadMoreButton(data);
    },
    error: function (error) {
        console.log(error);
    },
});
$(document).ready(function () {
    LoadProducts();
});

/**
 * @param {*} nextPage
 */
function loadMore(nextPage) {
    LoadProducts(nextPage, true);
}

/**
 * Mục đích dùng để kiểm tra điều kiện và render nút Load More
 * @param {*} productPageData
 */
function renderLoadMoreButton(productPageData) {
    if (productPageData.number < productPageData.totalPages - 1) {
        $("#LoadMoreContainer").html(
            `
    <button type="button" class="btn btn-secondary" 
    onclick="loadMore(${productPageData.number + 1})">Load More</button>
    `
        );
    } else {
        $("#LoadMoreContainer").remove();
    }
}

/**
 * @param {x} products: Dah sách sản phẩm cần được render lên browser
 * @param {*} append: nếu là true thì dữ liệu sản phẩm sẽ được append tiếp vào danh sách sản phẩm hiện tại, false sẽ ngược lại
 */
function renderProducts(products, append) {
    let elements = "";
    for (let product of products) {
        elements += `
    <div class="card col-sm-3">
    <img src="${product.thumbnail_url}" class="card-img-top" alt="..."> <div class="card-body">
    <h5 class="card-title">${product.name}</h5>
    <p class="card-text">${product.price}</p>
    <a href="#" class="btn btn-primary">Add Cart</a>
    </div>
    </div>
    `;
    }
    if (append) {
        $("#listProducts").append(elements);
    } else {
        $("#listProducts").html(elements);
    }
}