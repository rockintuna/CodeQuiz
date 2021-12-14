class LinkedTuple:
    def __init__(self):
        self.items = list()

    def add(self, key, value):
        self.items.append((key, value))

    def get(self, key):
        for k, v in self.items:
            if k == key:
                return v

class LinkedDict:
    def __init__(self):
        self.items = []
        for _ in range(8):
            self.items.append(LinkedTuple())

    def put(self, key, value):
        index = hash(key) % len(self.items)
        item = self.items[index]
        item.add(key, value)

    def get(self, key):
        index = hash(key) % len(self.items)
        item = self.items[index]
        return item.get(key)


my_dict = LinkedDict()

my_dict.put("A", 1)
my_dict.put("B", 2)
my_dict.put("C", 3)
my_dict.put("D", 4)
print(my_dict.get("C"))
print(my_dict.get("A"))