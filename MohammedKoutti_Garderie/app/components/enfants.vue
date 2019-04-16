<template>
    <Page class="page">
        <ActionBar title="Enfants" class="action-bar">
            <SearchBar hint="nom de l'enfant" :text="searchPhrase"
                @textChange="onTextChanged" @submit="onSubmit" />
        </ActionBar>
        <ScrollView>
            <ListView for="item in items" class="list-group" @itemTap="onItemTap">

                <v-template>
                    <GridLayout class="list-group-item" rows="*" columns="auto, *">
                        <Image row="0" col="0" :src="item.src" class="thumb img-circle" />
                        <Label row="0" col="1" :text="item.text" />
                    </GridLayout>
                </v-template>
            </ListView>
        </ScrollView>
    </Page>
</template>

<script>
    export default {
        data() {
            return {
                items: [{
                        text: "Enfant1",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"
                    },
                    {
                        text: "Enfant2",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png"
                    },
                    {
                        text: "Enfant3",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png"
                    },
                    {
                        text: "Enfant4",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png"
                    },
                    {
                        text: "Enfant5",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png"
                    },
                    {
                        text: "Enfant6",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png"
                    },
                    {
                        text: "Enfant7",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png"
                    },
                    {
                        text: "Enfant8",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png"
                    },
                    {
                        text: "Enfant9",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png"
                    },
                    {
                        text: "Enfant1",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png"
                    },
                    {
                        text: "Enfant10",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png"
                    },
                    {
                        text: "Enfant11",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png"
                    },
                    {
                        text: "Enfant12",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png"
                    },
                    {
                        text: "Enfant13",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png"
                    },
                    {
                        text: "Enfant14",
                        src: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png"
                    }
                ]
            };
        },
        methods: {
            onItemTap: function(event) {
                console.log("You tapped: " + this.$data.items[event.index]
                    .text);
            }
        }
    };
</script>